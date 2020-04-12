/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.realcodeline.generate;

/**
 * This class has the need tools to generate a new password.
 * @author abel
 */
public class Generate extends AbsGenerate implements IGenerate {

    /**
     * Builder Method.
     */
    public Generate() {
        super();
    }
    
    /**
     * This class is for generating password, it receives data from the 
     * user and work to generate a new password.
     * @param size Integer - For Password desired size.
     * @param upcase Boolean - For UpCase Letters.
     * @param lowcase Boolean - For LowCase Letters.
     * @param number Boolean - For Numbers generation.
     * @param symbol Boolean - For Symbols generation.
     */
    @Override
    public void gerenciandoPassInfo(int size, boolean upcase, boolean lowcase, 
            boolean number, boolean symbol) {
        // limpando todos os atributos
        this.cleanAll();
        // validando dados
        this.sedingInformation(size, upcase, lowcase, number, symbol);
        // verificando se não houve sucesso.
        if (!this.isAllow()) {
            // finaliza a execução e retorna
            return;
        }
        // inserindo valor de item selecionado pelo usuario
        this.howManyChoosePass();
        // resetando allow
        this.setAllow(false);
        // verificando numero de escolha do usuário
        switch (this.getItem()) {
            case 1:
                // apenas uma opção para geração de caracteres
                this.oneArgument();
                break;
            case 2:
                // duas opções para geração de caracteres
                this.twoArgument();
                break;
            case 3:
                // três opções para geração de caracteres
                this.threeArgument();
                break;
            case 4:
                // quatro (todas) as opções disponíveis
                this.fourArgument();
                break;
            default:
                break;
        }
    }
    
    /**
     * This method returns the generated password.
     * @return String - the password that was generated.
     */
    @Override
    public String takePasswordGenerated() {
        if (this.isAllow()) {
            return this.getPassword();
        }
        this.cleanAll();
        return this.getPassword();
    }
    
    /**
     * When user choose four (ALL) arguments to generate a new Password.
     */
    private void fourArgument() {
        int aux; // variável auxiliar
        while (this.getPassword().length() < this.getSize()) {
            aux = 1+this.getRad().nextInt(4);
            if (aux == this.getRandom()) {
                // volta ao incio do loop e reexecuta
                continue;
            }
            this.setRandom(aux);
            switch (this.getRandom()) {
                case 1:
                    // inserindo letra maiuscula
                    this.onlyUpCaseChar();
                    break;
                case 2:
                    // inserindo letra minuscula
                    this.onlyLowCaseChar();
                    break;
                case 3:
                    // inserindo numero
                    this.onlyNumberChar();
                    break;
                case 4:
                    // inserindo simbolo
                    this.onlySymbolChar();
                    break;
                default:
                    break;
            }
        }
        this.setAllow(true);
    }
    
    /**
     * When user chooses three arguments to generate a new Password.
     */
    private void threeArgument() {
        int aux; // variável auxiliar
        if (this.isUpcase() && this.isLowcase() && this.isNumber()) {
            while (this.getPassword().length() < this.getSize()) {
                aux = 1+this.getRad().nextInt(3);
                if (aux == this.getRandom()) {
                    // volta e reexecuta o loop.
                    continue;
                }
                this.setRandom(aux);
                switch (this.getRandom()) {
                    case 1:
                        this.onlyUpCaseChar();
                        break;
                    case 2:
                        this.onlyLowCaseChar();
                        break;
                    case 3:
                        this.onlyNumberChar();
                        break;
                    default:
                        break;
                }
            }
        }
        else if (this.isUpcase() && this.isLowcase() && this.isSymbol()) {
            while (this.getPassword().length() < this.getSize()) {
                aux = 1+this.getRad().nextInt(3);
                if (aux == this.getRandom()) {
                    // volta e reexecuta o loop.
                    continue;
                }
                this.setRandom(aux);
                switch (this.getRandom()) {
                    case 1:
                        this.onlyUpCaseChar();
                        break;
                    case 2:
                        this.onlyLowCaseChar();
                        break;
                    case 3:
                        this.onlySymbolChar();
                        break;
                    default:
                        break;
                }
            }
        }
        else if (this.isUpcase() && this.isNumber() && this.isSymbol()) {
            while (this.getPassword().length() < this.getSize()) {
                aux = 1+this.getRad().nextInt(3);
                if (aux == this.getRandom()) {
                    // volta e reexecuta o loop.
                    continue;
                }
                this.setRandom(aux);
                switch (this.getRandom()) {
                    case 1:
                        this.onlyUpCaseChar();
                        break;
                    case 2:
                        this.onlyNumberChar();
                        break;
                    case 3:
                        this.onlySymbolChar();
                        break;
                    default:
                        break;
                }
            }
        }
        else if (this.isLowcase() && this.isNumber() && this.isSymbol()) {
            while (this.getPassword().length() < this.getSize()) {
                aux = 1+this.getRad().nextInt(3);
                if (aux == this.getRandom()) {
                    // volta e reexecuta o loop.
                    continue;
                }
                this.setRandom(aux);
                switch (this.getRandom()) {
                    case 1:
                        this.onlyLowCaseChar();
                        break;
                    case 2:
                        this.onlyNumberChar();
                        break;
                    case 3:
                        this.onlySymbolChar();
                        break;
                    default:
                        break;
                }
            }
        }
        this.setAllow(true);
    }
    
    /**
     * When user chooses two arguments to generate a new Password.
     */
    private void twoArgument() {
        int aux; // variável auxiliar
        if (this.isUpcase() && this.isLowcase()) {
            while (this.getPassword().length() < this.getSize()) {
                aux = 1+this.getRad().nextInt(2);
                if (aux == this.getRandom()) {
                    // volta e reexecuta o loop.
                    continue;
                }
                this.setRandom(aux);
                switch (this.getRandom()) {
                    case 1:
                        this.onlyUpCaseChar();
                        break;
                    case 2:
                        this.onlyLowCaseChar();
                        break;
                    default:
                        break;
                }
            }
        }
        else if (this.isUpcase() && this.isNumber()) {
            while (this.getPassword().length() < this.getSize()) {
                aux = 1+this.getRad().nextInt(2);
                if (aux == this.getRandom()) {
                    // volta e reexecuta o loop.
                    continue;
                }
                this.setRandom(aux);
                switch (this.getRandom()) {
                    case 1:
                        this.onlyUpCaseChar();
                        break;
                    case 2:
                        this.onlyNumberChar();
                        break;
                    default:
                        break;
                }
            }
        }
        else if (this.isUpcase() && this.isSymbol()) {
            while (this.getPassword().length() < this.getSize()) {
                aux = 1+this.getRad().nextInt(2);
                if (aux == this.getRandom()) {
                    // volta e reexecuta o loop.
                    continue;
                }
                this.setRandom(aux);
                switch (this.getRandom()) {
                    case 1:
                        this.onlyUpCaseChar();
                        break;
                    case 2:
                        this.onlySymbolChar();
                        break;
                    default:
                        break;
                }
            }
        }
        else if (this.isLowcase() && this.isNumber()) {
            while (this.getPassword().length() < this.getSize()) {
                aux = 1+this.getRad().nextInt(2);
                if (aux == this.getRandom()) {
                    // volta e reexecuta o loop.
                    continue;
                }
                this.setRandom(aux);
                switch (this.getRandom()) {
                    case 1:
                        this.onlyLowCaseChar();
                        break;
                    case 2:
                        this.onlyNumberChar();
                        break;
                    default:
                        break;
                }
            }
        }
        else if (this.isLowcase() && this.isSymbol()) {
            while (this.getPassword().length() < this.getSize()) {
                aux = 1+this.getRad().nextInt(2);
                if (aux == this.getRandom()) {
                    // volta e reexecuta o loop.
                    continue;
                }
                this.setRandom(aux);
                switch (this.getRandom()) {
                    case 1:
                        this.onlyLowCaseChar();
                        break;
                    case 2:
                        this.onlySymbolChar();
                        break;
                    default:
                        break;
                }
            }
        }
        else if (this.isNumber() && this.isSymbol()) {
            while (this.getPassword().length() < this.getSize()) {
                aux = 1+this.getRad().nextInt(2);
                if (aux == this.getRandom()) {
                    // volta e reexecuta o loop.
                    continue;
                }
                this.setRandom(aux);
                switch (this.getRandom()) {
                    case 1:
                        this.onlyNumberChar();
                        break;
                    case 2:
                        this.onlySymbolChar();
                        break;
                    default:
                        break;
                }
            }
        }
        this.setAllow(true);
    }
    
    /**
     * When user chooses just one argument to generate a new Password.
     */
    private void oneArgument() {
        if (this.isUpcase()) {
            while (this.getPassword().length() < this.getSize()) {
                // inserindo letra maiuscula
                this.onlyUpCaseChar();
            }
        } else if (this.isLowcase()) {
            while (this.getPassword().length() < this.getSize()) {
                // inserindo letra minuscula
                this.onlyLowCaseChar();
            }
        } else if (this.isNumber()) {
            while (this.getPassword().length() < this.getSize()) {
                // inserindo numero
                this.onlyNumberChar();
            }
        } else if (this.isSymbol()) {
            while (this.getPassword().length() < this.getSize()) {
                // inserindo simbolo
                this.onlySymbolChar();
            }
        }
        this.setAllow(true);
    }
    
    /**
     * This method is for auxiliary to generate characters.
     * @param a Integer - represents the initial value. 
     * @param b Integer - represents the interview.
     */
    private void useAndInsertDataToGenerateCharacter(int a, int b) {
        this.setInit(a);
        this.setFinish(b);
        this.setPassword(this.getPassword() + this.characterGenerator());
    }
    
    /**
     * Generate and insert only one character of UPCASE each time.
     */
    private void onlyUpCaseChar() {
        // maiusculas
        this.useAndInsertDataToGenerateCharacter(65, 26);
    }
    
    /**
     * Generate and insert only one character of LOWCASE each time.
     */
    private void onlyLowCaseChar() {
        // minusculas
        this.useAndInsertDataToGenerateCharacter(97, 26);
    }
    
    /**
     * Generate and insert only one character of Number each time.
     */
    private void onlyNumberChar() {
        // numeros
        this.useAndInsertDataToGenerateCharacter(48, 10);
    }
    
    /**
     * Generate and insert only one character of Symbol each time.
     */
    private void onlySymbolChar() {
        this.setRandom(1+this.getRad().nextInt(4));
        switch (this.getRandom()) {
            case 1:
                // simbolos 1
                this.useAndInsertDataToGenerateCharacter(33, 15);
                break;
            case 2:
                // simbolos 2
                this.useAndInsertDataToGenerateCharacter(58, 7);
                break;
            case 3:
                // simbolos 3
                this.useAndInsertDataToGenerateCharacter(91, 6);
                break;
            case 4:
                // simbolos 4
                this.useAndInsertDataToGenerateCharacter(123, 4);
                break;
            default:
                break;
        }
    }
    
}
