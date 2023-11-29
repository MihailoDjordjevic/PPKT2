package rs.raf.m_stojanovic.pp.programs.simplecompiler.lexer;

import java.util.LinkedHashMap;
import java.util.Map;

public class WordTypes {

    public static final Map<String, WordType> REGEXES = new LinkedHashMap<>();

    private static void putWordTypeToMap(WordType word) {
        REGEXES.put(word.getRegex(), word);
    }

    public static final WordType MAIN_WORD
            = new WordType("main", "main"); //ok

    public static final WordType ASSIGN_WORD
            = new WordType("assign", "\\=");  //ok

    public static final WordType NAME_WORD
            = new WordType("name", "[a-zA-Z_][a-zA-Z0-9_]*");  //ok

    public static final WordType IF_WORD
            = new WordType("if", "if");  //ok
    public static final WordType ELIF_WORD
            = new WordType("elif", "elif");  //ok
    public static final WordType ELSE_WORD
            = new WordType("else", "else");  //ok
    public static final WordType FOR_WORD
            = new WordType("for", "for");  //ok
    public static final WordType WHILE_WORD
            = new WordType("while", "while");  //ok
    public static final WordType DWHILE_WORD
            = new WordType("dwhile", "dwhile");  //ok

    public static final WordType READ_WORD
            = new WordType("read", "read");  //ok
    public static final WordType PRINT_WORD
            = new WordType("print", "print");  //ok

    public static final WordType INT_TYPE_WORD
            = new WordType("int", "int"); //ok
    public static final WordType CHAR_TYPE_WORD
            = new WordType("char", "char");  //ok
    private static final WordType DOUBLE_TYPE_WORD
            = new WordType("double", "double");  //ok
    private static final WordType STRING_TYPE_WORD
            = new WordType("String", "String");  //ok
    public static final WordType FINAL_TYPE_WORD
            = new WordType("final", "final"); //ok

    private static final WordType BEGINNING_OF_AN_INT_WORD
            = new WordType("int-first-digit", "-?[1-9]");
    private static final WordType BEGINNING_OF_AN_OCT_INT_WORD
            = new WordType("oct-int-first-digit", "O-?[1-7]");
    private static final WordType BEGINNING_OF_AN_HEX_INT_WORD
            = new WordType("hex-int-first-digit", "0x-?[1-9A-F]");

    public static final WordType INT_WORD
            = new WordType("integer_word", BEGINNING_OF_AN_INT_WORD.getRegex() + "[0-9]*|0");
    public static final WordType OCT_INT_WORD
            = new WordType("oct_integer_word", BEGINNING_OF_AN_OCT_INT_WORD.getRegex() + "[0-7]*|0");
    public static final WordType HEX_INT_WORD
            = new WordType("hex_integer_word", BEGINNING_OF_AN_HEX_INT_WORD.getRegex() + "[0-9A-F]*|0");
    public static final WordType DOUBLE_WORD
            = new WordType("double_word",
            "-?(" + INT_WORD.getRegex() + ")" + "|" +
            "((" + INT_WORD.getRegex() + "|0)\\.0*" +  INT_WORD.getRegex() + ")|(" +
            "[0-9]\\.0*(" + INT_WORD.getRegex() + ")(E|e)(" + INT_WORD.getRegex() + "))");
    public static final WordType CHAR_WORD
            = new WordType("character", "\\'.\\'");
    public static final WordType STRING_WORD
            = new WordType("string_word", "\\\".*\\\"");
    public static final WordType ARRAY_TYPE_WORD
            = new WordType("arraytype",
            "(" + INT_TYPE_WORD.getRegex() + "|" +
                    CHAR_TYPE_WORD.getRegex() + "|" +
                    DOUBLE_TYPE_WORD.getRegex() + "|" +
                    STRING_TYPE_WORD.getRegex() + ")" + "\\[(" +
                    INT_WORD.getRegex() + ")" + "?" + "\\]"
    );  //ok

    public static final WordType PLUS_WORD
            = new WordType("plus", "\\+");  //ok
    public static final WordType MINUS_WORD
            = new WordType("minus", "\\-");  //ok
    public static final WordType TIMES_WORD
            = new WordType("times", "\\*");  //ok
    public static final WordType DIV_WORD
            = new WordType("div", "/");  //ok
    public static final WordType MOD_WORD
            = new WordType("mod", "\\%");  //ok
    public static final WordType EXPONENTIATION_WORD
            = new WordType("exponentiation", "\\^"); //ok
    public static final WordType INCREMENT_WORD
            = new WordType("increment", "\\+\\+"); //ok
    public static final WordType DECREMENT_WORD
            = new WordType("decrement", "\\-\\-"); //ok

    public static final WordType EQUALS_SIGN
            = new WordType("equals", "\\=\\=");  //ok
    public static final WordType NOT_EQUALS_SIGN
            = new WordType("not equals", "\\<\\>");  //ok
    public static final WordType LESS_THAN_SIGN
            = new WordType("less", "\\<");  //ok
    public static final WordType LESS_OR_EQUALS_SIGN
            = new WordType("less or equals", "\\<\\=");  //ok
    public static final WordType GREATER_THAN_SIGN
            = new WordType("greater", "\\>");  //ok
    public static final WordType GREATER_OR_EQUALS_SIGN
            = new WordType("greater or equals", "\\>\\=");  //ok

    public static final WordType LOGICAL_AND_WORD
            = new WordType("logand", "and");   //ok
    public static final WordType LOGICAL_OR_WORD
            = new WordType("logor", "or");  //ok
    public static final WordType LOGICAL_NOT_WORD
            = new WordType("lognot", "\\!");  //ok

    public static final WordType OPEN_CURLY_BRACKET_WORD
            = new WordType("open curly bracket", "\\{");  //ok
    public static final WordType CLOSED_CURLY_BRACKET_WORD
            = new WordType("closed curly bracket", "\\}");    //ok
    public static final WordType OPEN_BRACKET_WORD
            = new WordType("open bracket", "\\(");    //ok
    public static final WordType CLOSED_BRACKET_WORD
            = new WordType("closed bracket", "\\)");    //ok
    public static final WordType ENUMERATION_WORD
            = new WordType("enumeration", "\\,");    //ok

    static {
        putWordTypeToMap(MAIN_WORD);

        putWordTypeToMap(IF_WORD);
        putWordTypeToMap(ELIF_WORD);
        putWordTypeToMap(ELSE_WORD);
        putWordTypeToMap(FOR_WORD);
        putWordTypeToMap(WHILE_WORD);
        putWordTypeToMap(DWHILE_WORD);

        putWordTypeToMap(READ_WORD);
        putWordTypeToMap(PRINT_WORD);

        putWordTypeToMap(INT_TYPE_WORD);
        putWordTypeToMap(CHAR_TYPE_WORD);
        putWordTypeToMap(DOUBLE_TYPE_WORD);
        putWordTypeToMap(STRING_TYPE_WORD);
        putWordTypeToMap(FINAL_TYPE_WORD);

        putWordTypeToMap(OPEN_CURLY_BRACKET_WORD);
        putWordTypeToMap(CLOSED_CURLY_BRACKET_WORD);
        putWordTypeToMap(OPEN_BRACKET_WORD);
        putWordTypeToMap(CLOSED_BRACKET_WORD);
        putWordTypeToMap(ENUMERATION_WORD);

        putWordTypeToMap(PLUS_WORD);
        putWordTypeToMap(MINUS_WORD);
        putWordTypeToMap(TIMES_WORD);
        putWordTypeToMap(DIV_WORD);
        putWordTypeToMap(MOD_WORD);
        putWordTypeToMap(EXPONENTIATION_WORD);
        putWordTypeToMap(INCREMENT_WORD);
        putWordTypeToMap(DECREMENT_WORD);

        putWordTypeToMap(ASSIGN_WORD);

        putWordTypeToMap(EQUALS_SIGN);
        putWordTypeToMap(NOT_EQUALS_SIGN);
        putWordTypeToMap(LESS_THAN_SIGN);
        putWordTypeToMap(LESS_OR_EQUALS_SIGN);
        putWordTypeToMap(GREATER_THAN_SIGN);
        putWordTypeToMap(GREATER_OR_EQUALS_SIGN);

        putWordTypeToMap(LOGICAL_AND_WORD);
        putWordTypeToMap(LOGICAL_OR_WORD);
        putWordTypeToMap(LOGICAL_NOT_WORD);

        putWordTypeToMap(STRING_WORD);
        putWordTypeToMap(CHAR_WORD);
        putWordTypeToMap(INT_WORD);
        putWordTypeToMap(OCT_INT_WORD);
        putWordTypeToMap(HEX_INT_WORD);
        putWordTypeToMap(DOUBLE_WORD);
        putWordTypeToMap(ARRAY_TYPE_WORD);

        putWordTypeToMap(NAME_WORD);
    }

    private WordTypes() {

    }
}
