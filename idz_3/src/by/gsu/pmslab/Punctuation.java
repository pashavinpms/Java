package by.gsu.pmslab;

public enum Punctuation {

    DOT('.'),
    COMMA(','),
    SPACE(' '),
    EXCLAMATION('!'),
    QUESTION('?'),
    NUMBERSIGN('#'),
    DOLLAR('$'),
    PERCENT('%'),
    AMPERSAND('&'),
    ASTERISK('*'),
    PLUS('+'),
    MINUS('-'),
    SLASH('/'),
    COLON(':'),
    SEMICOLON(';'),
    LESSTHAN('<'),
    EQUAL('='),
    GREATERTHAN('>'),
    LSQUAREBRACKETS('['),
    RSQUAREBRACKETS(']'),
    LEFTBRACKETS('('),
    RIGHTBRACKETS(')'),
    CARET('^'),
    UNDERSCORE('_'),
    GRAVIS('`'),
    LCURLYBRACKETS('{'),
    VERTICALBAR('|'),
    RCURLYBRACKETS('}'),
    TILDE('~'),
    QUOTATION('"'),
    BACKSLASHS('\\'),
    INTERROBANG('\u2048'),
    DISAMBIGUATION('\u2047');

    private char symbol;

    private Punctuation(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return this.symbol;
    }
}
