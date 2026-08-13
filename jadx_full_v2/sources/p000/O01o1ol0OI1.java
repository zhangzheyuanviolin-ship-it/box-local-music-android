            package p000;

            import java.io.EOFException;
            import java.io.IOException;
            import java.math.BigDecimal;
            import p000.O01lo1il;
            
/* 46 */    public final class O01o1ol0OI1 extends O01lo1il {
                private static final IIOIIi1ilIO CLOSING_BLOCK_COMMENT;
                private static final IIOIIi1ilIO DOUBLE_QUOTE_OR_SLASH;
                private static final IIOIIi1ilIO LINEFEED_OR_CARRIAGE_RETURN;
                private static final long MIN_INCOMPLETE_INTEGER = -922337203685477580L;
                private static final int NUMBER_CHAR_DECIMAL = 3;
                private static final int NUMBER_CHAR_DIGIT = 2;
                private static final int NUMBER_CHAR_EXP_DIGIT = 7;
                private static final int NUMBER_CHAR_EXP_E = 5;
                private static final int NUMBER_CHAR_EXP_SIGN = 6;
                private static final int NUMBER_CHAR_FRACTION_DIGIT = 4;
                private static final int NUMBER_CHAR_NONE = 0;
                private static final int NUMBER_CHAR_SIGN = 1;
                private static final int PEEKED_BEGIN_ARRAY = 3;
                private static final int PEEKED_BEGIN_OBJECT = 1;
                private static final int PEEKED_BUFFERED = 11;
                private static final int PEEKED_BUFFERED_NAME = 15;
                private static final int PEEKED_DOUBLE_QUOTED = 9;
                private static final int PEEKED_DOUBLE_QUOTED_NAME = 13;
                private static final int PEEKED_END_ARRAY = 4;
                private static final int PEEKED_END_OBJECT = 2;
                private static final int PEEKED_EOF = 18;
                private static final int PEEKED_FALSE = 6;
                private static final int PEEKED_LONG = 16;
                private static final int PEEKED_NONE = 0;
                private static final int PEEKED_NULL = 7;
                private static final int PEEKED_NUMBER = 17;
                private static final int PEEKED_SINGLE_QUOTED = 8;
                private static final int PEEKED_SINGLE_QUOTED_NAME = 12;
                private static final int PEEKED_TRUE = 5;
                private static final int PEEKED_UNQUOTED = 10;
                private static final int PEEKED_UNQUOTED_NAME = 14;
                private static final IIOIIi1ilIO SINGLE_QUOTE_OR_SLASH;
                private static final IIOIIi1ilIO UNQUOTED_STRING_TERMINALS;
                private final III1o0lOio0 buffer;
                private int peeked;
                private long peekedLong;
                private int peekedNumberLength;
                private String peekedString;
                private final IIIIlO11I0lO source;
                private O01oiO0l valueSource;

                static {
/* 11 */            IIOIIi1ilIO iIOIIi1ilIO = new IIOIIi1ilIO("'\\".getBytes(IO1IOI.I00000oIO));
/* 14 */            iIOIIi1ilIO.I00iiO = "'\\";
/* 16 */            SINGLE_QUOTE_OR_SLASH = iIOIIi1ilIO;
/* 28 */            IIOIIi1ilIO iIOIIi1ilIO2 = new IIOIIi1ilIO("\"\\".getBytes(IO1IOI.I00000oIO));
/* 31 */            iIOIIi1ilIO2.I00iiO = "\"\\";
/* 33 */            DOUBLE_QUOTE_OR_SLASH = iIOIIi1ilIO2;
/* 45 */            IIOIIi1ilIO iIOIIi1ilIO3 = new IIOIIi1ilIO("{}[]:, \n\t\r\f/\\;#=".getBytes(IO1IOI.I00000oIO));
/* 48 */            iIOIIi1ilIO3.I00iiO = "{}[]:, \n\t\r\f/\\;#=";
/* 50 */            UNQUOTED_STRING_TERMINALS = iIOIIi1ilIO3;
/* 62 */            IIOIIi1ilIO iIOIIi1ilIO4 = new IIOIIi1ilIO("\n\r".getBytes(IO1IOI.I00000oIO));
/* 65 */            iIOIIi1ilIO4.I00iiO = "\n\r";
/* 67 */            LINEFEED_OR_CARRIAGE_RETURN = iIOIIi1ilIO4;
/* 79 */            IIOIIi1ilIO iIOIIi1ilIO5 = new IIOIIi1ilIO("*/".getBytes(IO1IOI.I00000oIO));
/* 82 */            iIOIIi1ilIO5.I00iiO = "*/";
/* 84 */            CLOSING_BLOCK_COMMENT = iIOIIi1ilIO5;
                }

                public O01o1ol0OI1(O01o1ol0OI1 o01o1ol0OI1) {
/* 1 */             super(o01o1ol0OI1);
/* 5 */             this.peeked = 0;
/* 9 */             OOliO0 oOliO0Peek = o01o1ol0OI1.source.peek();
/* 13 */            this.source = oOliO0Peek;
/* 17 */            this.buffer = oOliO0Peek.I00iiI;
/* 21 */            this.peeked = o01o1ol0OI1.peeked;
/* 25 */            this.peekedLong = o01o1ol0OI1.peekedLong;
/* 29 */            this.peekedNumberLength = o01o1ol0OI1.peekedNumberLength;
/* 33 */            this.peekedString = o01o1ol0OI1.peekedString;
                    try {
/* 39 */                oOliO0Peek.I00100o1O0lo(o01o1ol0OI1.buffer.I00iiI);
                    } catch (IOException unused) {
/* 43 */                OoOil11Ol1o.I0000Il00O();
/* 49 */                throw null;
                    }
                }

                private void checkLenient() throws O01Ol0I {
/* 3 */             if (!this.lenient) {
/* 29 */                throw syntaxError("Use JsonReader.setLenient(true) to accept malformed JSON");
                    }
                }

                private int doPeek() throws O01Ol0I, EOFException {
/* 3 */             int[] iArr = this.scopes;
/* 5 */             int i = this.stackSize;
/* 9 */             int i2 = iArr[i - 1];
/* 28 */            if (i2 == 1) {
/* 31 */                iArr[i - 1] = 2;
                    } else if (i2 == 2) {
/* 37 */                int iNextNonWhitespace = nextNonWhitespace(true);
/* 43 */                this.buffer.readByte();
/* 46 */                if (iNextNonWhitespace != 44) {
/* 48 */                    if (iNextNonWhitespace != 59) {
/* 50 */                        if (iNextNonWhitespace != 93) {
/* 61 */                            throw syntaxError("Unterminated array");
                                }
/* 52 */                        this.peeked = 4;
/* 25 */                        return 4;
                            }
/* 62 */                    checkLenient();
                        }
                    } else {
/* 68 */                if (i2 == 3 || i2 == 5) {
/* 322 */                   iArr[i - 1] = 4;
/* 326 */                   if (i2 == 5) {
/* 328 */                       int iNextNonWhitespace2 = nextNonWhitespace(true);
/* 334 */                       this.buffer.readByte();
/* 337 */                       if (iNextNonWhitespace2 != 44) {
/* 339 */                           if (iNextNonWhitespace2 != 59) {
/* 341 */                               if (iNextNonWhitespace2 != 125) {
/* 353 */                                   throw syntaxError("Unterminated object");
                                        }
/* 344 */                               this.peeked = 2;
/* 343 */                               return 2;
                                    }
/* 354 */                           checkLenient();
                                }
                            }
/* 357 */                   int iNextNonWhitespace3 = nextNonWhitespace(true);
/* 363 */                   if (iNextNonWhitespace3 == 34) {
/* 424 */                       this.buffer.readByte();
/* 429 */                       this.peeked = 13;
/* 427 */                       return 13;
                            }
/* 367 */                   if (iNextNonWhitespace3 == 39) {
/* 411 */                       this.buffer.readByte();
/* 414 */                       checkLenient();
/* 419 */                       this.peeked = 12;
/* 417 */                       return 12;
                            }
/* 371 */                   if (iNextNonWhitespace3 != 125) {
/* 373 */                       checkLenient();
/* 381 */                       if (!isLiteral((char) iNextNonWhitespace3)) {
/* 392 */                           throw syntaxError("Expected name");
                                }
/* 385 */                       this.peeked = 14;
/* 383 */                       return 14;
                            }
/* 393 */                   if (i2 == 5) {
/* 408 */                       throw syntaxError("Expected name");
                            }
/* 397 */                   this.buffer.readByte();
/* 401 */                   this.peeked = 2;
/* 400 */                   return 2;
                        }
/* 74 */                if (i2 == 4) {
/* 77 */                    iArr[i - 1] = 5;
/* 79 */                    int iNextNonWhitespace4 = nextNonWhitespace(true);
/* 85 */                    this.buffer.readByte();
/* 90 */                    if (iNextNonWhitespace4 != 58) {
/* 94 */                        if (iNextNonWhitespace4 != 61) {
/* 131 */                           throw syntaxError("Expected ':'");
                                }
/* 96 */                        checkLenient();
/* 107 */                       if (this.source.I000lI(1L) && this.buffer.I000O01llI0(0L) == 62) {
/* 121 */                           this.buffer.readByte();
                                }
                            }
                        } else if (i2 == 6) {
/* 136 */                   iArr[i - 1] = 7;
                        } else if (i2 == 7) {
/* 147 */                   if (nextNonWhitespace(false) == -1) {
/* 151 */                       this.peeked = 18;
/* 149 */                       return 18;
                            }
/* 154 */                   checkLenient();
                        } else {
/* 158 */                   if (i2 == 9) {
/* 162 */                       this.valueSource.discard();
/* 166 */                       this.valueSource = null;
                                this.stackSize--;
/* 173 */                       return doPeek();
                            }
/* 178 */                   if (i2 == 8) {
/* 316 */                       I000II.I001IO000("JsonReader is closed");
/* 319 */                       return 0;
                            }
                        }
                    }
/* 180 */           int iNextNonWhitespace5 = nextNonWhitespace(true);
/* 186 */           if (iNextNonWhitespace5 == 34) {
/* 308 */               this.buffer.readByte();
/* 311 */               this.peeked = 9;
/* 13 */                return 9;
                    }
/* 190 */           if (iNextNonWhitespace5 == 39) {
/* 295 */               checkLenient();
/* 300 */               this.buffer.readByte();
/* 303 */               this.peeked = 8;
/* 11 */                return 8;
                    }
/* 192 */           if (iNextNonWhitespace5 != 44 && iNextNonWhitespace5 != 59) {
/* 198 */               if (iNextNonWhitespace5 == 91) {
/* 269 */                   this.buffer.readByte();
/* 273 */                   this.peeked = 3;
/* 272 */                   return 3;
                        }
/* 202 */               if (iNextNonWhitespace5 != 93) {
/* 206 */                   if (iNextNonWhitespace5 == 123) {
/* 251 */                       this.buffer.readByte();
/* 254 */                       this.peeked = 1;
/* 27 */                        return 1;
                            }
/* 208 */                   int iPeekKeyword = peekKeyword();
/* 212 */                   if (iPeekKeyword != 0) {
/* 214 */                       return iPeekKeyword;
                            }
/* 215 */                   int iPeekNumber = peekNumber();
/* 219 */                   if (iPeekNumber != 0) {
/* 221 */                       return iPeekNumber;
                            }
/* 232 */                   if (!isLiteral(this.buffer.I000O01llI0(0L))) {
/* 248 */                       throw syntaxError("Expected value");
                            }
/* 234 */                   checkLenient();
/* 239 */                   this.peeked = 10;
/* 237 */                   return 10;
                        }
/* 257 */               if (i2 == 1) {
/* 261 */                   this.buffer.readByte();
/* 264 */                   this.peeked = 4;
/* 25 */                    return 4;
                        }
                    }
/* 276 */           if (i2 != 1 && i2 != 2) {
/* 288 */               throw syntaxError("Unexpected value");
                    }
/* 289 */           checkLenient();
/* 292 */           this.peeked = 7;
/* 20 */            return 7;
                }

                private int findName(String str, O01lo1il.I00000oIO i00000oIO) {
/* 3 */             int length = i00000oIO.strings.length;
/* 6 */             for (int i = 0; i < length; i++) {
/* 16 */                if (str.equals(i00000oIO.strings[i])) {
/* 18 */                    this.peeked = 0;
/* 26 */                    this.pathNames[this.stackSize - 1] = str;
/* 28 */                    return i;
                        }
                    }
/* 32 */            return -1;
                }

                private int findString(String str, O01lo1il.I00000oIO i00000oIO) {
/* 3 */             int length = i00000oIO.strings.length;
/* 6 */             for (int i = 0; i < length; i++) {
/* 16 */                if (str.equals(i00000oIO.strings[i])) {
/* 18 */                    this.peeked = 0;
/* 20 */                    int[] iArr = this.pathIndices;
                            int i2 = this.stackSize - 1;
/* 30 */                    iArr[i2] = iArr[i2] + 1;
/* 32 */                    return i;
                        }
                    }
/* 36 */            return -1;
                }

                private boolean isLiteral(int i) throws O01Ol0I {
/* 3 */             if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
/* 61 */                return false;
                    }
/* 23 */            if (i != 35) {
/* 27 */                if (i == 44) {
/* 61 */                    return false;
                        }
/* 31 */                if (i != 47 && i != 61) {
/* 39 */                    if (i == 123 || i == 125 || i == 58) {
/* 61 */                        return false;
                            }
/* 51 */                    if (i != 59) {
                                switch (i) {
                                    case 91:
                                    case 93:
/* 61 */                                return false;
                                    case 92:
                                        break;
                                    default:
/* 56 */                                return true;
                                }
                            }
                        }
                    }
/* 58 */            checkLenient();
/* 61 */            return false;
                }

                /* JADX WARN: Code restructure failed: missing block: B:15:0x0025, code lost:
                
                    r6.buffer.skip(r1);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
                
                    if (r2 != 47) goto L41;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
                
                    if (r6.source.I000lI(2) != false) goto L20;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
                
                    checkLenient();
                    r3 = r6.buffer.I000O01llI0(1);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
                
                    if (r3 == 42) goto L43;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
                
                    if (r3 == 47) goto L24;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
                
                    r6.buffer.readByte();
                    r6.buffer.readByte();
                    skipToEndOfLine();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
                
                    r6.buffer.readByte();
                    r6.buffer.readByte();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:26:0x0068, code lost:
                
                    if (skipToEndOfBlockComment() == false) goto L46;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
                
                    throw syntaxError("Unterminated comment");
                 */
                /* JADX WARN: Code restructure failed: missing block: B:31:0x0074, code lost:
                
                    if (r2 != 35) goto L48;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:32:0x0076, code lost:
                
                    checkLenient();
                    skipToEndOfLine();
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                private int nextNonWhitespace(boolean z) throws O01Ol0I, EOFException {
                    byte bI000O01llI0;
                    while (true) {
/* 2 */                 int i = 0;
                        while (true) {
/* 5 */                     int i2 = i + 1;
/* 12 */                    if (!this.source.I000lI(i2)) {
/* 129 */                       if (z) {
/* 186 */                           throw new EOFException("End of input");
                                }
/* 131 */                       return -1;
                            }
/* 17 */                    bI000O01llI0 = this.buffer.I000O01llI0(i);
/* 23 */                    if (bI000O01llI0 != 10 && bI000O01llI0 != 32 && bI000O01llI0 != 13 && bI000O01llI0 != 9) {
                                break;
                            }
/* 127 */                   i = i2;
                        }
                    }
/* 126 */           return bI000O01llI0;
                }

                private String nextQuotedValue(IIOIIi1ilIO iIOIIi1ilIO) throws O01Ol0I, EOFException {
/* 1 */             StringBuilder sb = null;
                    while (true) {
/* 4 */                 long jI00IlilI0i0i = this.source.I00IlilI0i0i(iIOIIi1ilIO);
/* 12 */                if (jI00IlilI0i0i == -1) {
/* 186 */                   throw syntaxError("Unterminated string");
                        }
/* 22 */                if (this.buffer.I000O01llI0(jI00IlilI0i0i) != 92) {
/* 58 */                    III1o0lOio0 iII1o0lOio0 = this.buffer;
/* 60 */                    if (sb == null) {
/* 62 */                        iII1o0lOio0.getClass();
/* 67 */                        String strI00OOll1 = iII1o0lOio0.I00OOll1(jI00IlilI0i0i, IO1IOI.I00000oIO);
/* 73 */                        this.buffer.readByte();
/* 76 */                        return strI00OOll1;
                            }
/* 77 */                    iII1o0lOio0.getClass();
/* 86 */                    sb.append(iII1o0lOio0.I00OOll1(jI00IlilI0i0i, IO1IOI.I00000oIO));
/* 91 */                    this.buffer.readByte();
/* 94 */                    return sb.toString();
                        }
/* 24 */                if (sb == null) {
/* 28 */                    sb = new StringBuilder();
                        }
/* 31 */                III1o0lOio0 iII1o0lOio02 = this.buffer;
/* 33 */                iII1o0lOio02.getClass();
/* 42 */                sb.append(iII1o0lOio02.I00OOll1(jI00IlilI0i0i, IO1IOI.I00000oIO));
/* 47 */                this.buffer.readByte();
/* 54 */                sb.append(readEscapeCharacter());
                    }
                }

                private String nextUnquotedValue() {
/* 5 */             long jI00IlilI0i0i = this.source.I00IlilI0i0i(UNQUOTED_STRING_TERMINALS);
/* 13 */            III1o0lOio0 iII1o0lOio0 = this.buffer;
/* 15 */            if (jI00IlilI0i0i == -1) {
/* 27 */                return iII1o0lOio0.I00Ol00();
                    }
/* 17 */            iII1o0lOio0.getClass();
/* 22 */            return iII1o0lOio0.I00OOll1(jI00IlilI0i0i, IO1IOI.I00000oIO);
                }

                private int peekKeyword() throws EOFException {
                    String str;
                    String str2;
                    int i;
/* 5 */             byte bI000O01llI0 = this.buffer.I000O01llI0(0L);
/* 12 */            if (bI000O01llI0 == 116 || bI000O01llI0 == 84) {
/* 50 */                str = "true";
/* 52 */                str2 = "TRUE";
/* 54 */                i = 5;
                    } else if (bI000O01llI0 == 102 || bI000O01llI0 == 70) {
/* 44 */                str = "false";
/* 46 */                str2 = "FALSE";
/* 48 */                i = 6;
                    } else {
/* 30 */                if (bI000O01llI0 != 110 && bI000O01llI0 != 78) {
/* 11 */                    return 0;
                        }
/* 38 */                str = "null";
/* 40 */                str2 = "NULL";
/* 42 */                i = 7;
                    }
/* 55 */            int length = str.length();
/* 59 */            int i2 = 1;
                    while (true) {
/* 60 */                IIIIlO11I0lO iIIIlO11I0lO = this.source;
/* 62 */                if (i2 >= length) {
/* 103 */                   if (iIIIlO11I0lO.I000lI(length + 1) && isLiteral(this.buffer.I000O01llI0(length))) {
/* 11 */                        return 0;
                            }
/* 122 */                   this.buffer.skip(length);
/* 125 */                   this.peeked = i;
/* 541 */                   return i;
                        }
/* 64 */                int i3 = i2 + 1;
/* 71 */                if (!iIIIlO11I0lO.I000lI(i3)) {
/* 11 */                    return 0;
                        }
/* 77 */                byte bI000O01llI02 = this.buffer.I000O01llI0(i2);
/* 85 */                if (bI000O01llI02 != str.charAt(i2) && bI000O01llI02 != str2.charAt(i2)) {
/* 11 */                    return 0;
                        }
/* 94 */                i2 = i3;
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:44:0x0089, code lost:
                
                    if (isLiteral(r1) != false) goto L66;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:45:0x008b, code lost:
                
                    if (r6 != 2) goto L58;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:46:0x008d, code lost:
                
                    if (r7 == false) goto L58;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:48:0x0093, code lost:
                
                    if (r8 != Long.MIN_VALUE) goto L50;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:49:0x0095, code lost:
                
                    if (r10 == false) goto L58;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:51:0x0099, code lost:
                
                    if (r8 != r16) goto L53;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:52:0x009b, code lost:
                
                    if (r10 != false) goto L58;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:53:0x009d, code lost:
                
                    if (r10 == false) goto L55;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:55:0x00a0, code lost:
                
                    r8 = -r8;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:56:0x00a1, code lost:
                
                    r19.peekedLong = r8;
                    r19.buffer.skip(r5);
                    r19.peeked = 16;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:57:0x00ad, code lost:
                
                    return 16;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:58:0x00ae, code lost:
                
                    if (r6 == 2) goto L64;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:59:0x00b0, code lost:
                
                    if (r6 == 4) goto L64;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:61:0x00b3, code lost:
                
                    if (r6 != 7) goto L63;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:63:0x00b6, code lost:
                
                    return r18;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:64:0x00b7, code lost:
                
                    r19.peekedNumberLength = r5;
                    r19.peeked = 17;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:65:0x00bd, code lost:
                
                    return 17;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:66:0x00be, code lost:
                
                    return 0;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                private int peekNumber() throws EOFException {
                    long j;
                    int i;
/* 4 */             boolean z = true;
/* 5 */             int i2 = 0;
/* 6 */             char c = 0;
/* 7 */             long j2 = 0;
/* 9 */             boolean z2 = false;
                    while (true) {
/* 12 */                int i3 = i2 + 1;
/* 21 */                if (!this.source.I000lI(i3)) {
/* 23 */                    j = 0;
/* 25 */                    i = 0;
                            break;
                        }
/* 31 */                j = 0;
/* 34 */                byte bI000O01llI0 = this.buffer.I000O01llI0(i2);
/* 41 */                i = 0;
/* 44 */                if (bI000O01llI0 != 43) {
/* 48 */                    if (bI000O01llI0 == 69 || bI000O01llI0 == 101) {
/* 207 */                       if (c != 2 && c != 4) {
/* 41 */                            return 0;
                                }
/* 213 */                       c = 5;
                            } else if (bI000O01llI0 != 45) {
/* 61 */                        if (bI000O01llI0 != 46) {
/* 65 */                            if (bI000O01llI0 < 48 || bI000O01llI0 > 57) {
                                        break;
                                    }
/* 72 */                            if (c == 1 || c == 0) {
/* 129 */                               j2 = -(bI000O01llI0 - 48);
/* 131 */                               c = 2;
                                    } else if (c == 2) {
/* 81 */                                if (j2 == 0) {
/* 41 */                                    return 0;
                                        }
/* 90 */                                long j3 = (10 * j2) - (bI000O01llI0 - 48);
/* 111 */                               z &= j2 > MIN_INCOMPLETE_INTEGER || (j2 == MIN_INCOMPLETE_INTEGER && j3 < j2);
/* 112 */                               j2 = j3;
                                    } else if (c == 3) {
/* 117 */                               c = 4;
                                    } else if (c == 5 || c == 6) {
/* 124 */                               c = 7;
                                    }
                                } else {
/* 192 */                           if (c != 2) {
/* 41 */                                return 0;
                                    }
/* 194 */                           c = 3;
                                }
                            } else if (c == 0) {
/* 199 */                       c = 1;
/* 200 */                       z2 = true;
                            } else if (c != 5) {
/* 41 */                        return 0;
                            }
/* 218 */                   i2 = i3;
                        } else if (c != 5) {
/* 41 */                    return 0;
                        }
/* 204 */               c = 6;
/* 218 */               i2 = i3;
                    }
                }

                private char readEscapeCharacter() throws O01Ol0I, EOFException {
                    int i;
/* 9 */             if (!this.source.I000lI(1L)) {
/* 541 */               throw syntaxError("Unterminated escape sequence");
                    }
/* 13 */            byte b = this.buffer.readByte();
/* 19 */            if (b == 10 || b == 34 || b == 39 || b == 47 || b == 92) {
/* 211 */               return (char) b;
                    }
/* 39 */            if (b == 98) {
/* 208 */               return '\b';
                    }
/* 43 */            if (b == 102) {
/* 205 */               return '\f';
                    }
/* 47 */            if (b == 110) {
/* 17 */                return '\n';
                    }
/* 51 */            if (b == 114) {
/* 201 */               return '\r';
                    }
/* 55 */            if (b == 116) {
/* 198 */               return '\t';
                    }
/* 59 */            if (b != 117) {
/* 63 */                if (this.lenient) {
/* 65 */                    return (char) b;
                        }
/* 86 */                throw syntaxError("Invalid escape sequence: \\" + ((char) b));
                    }
/* 95 */            if (!this.source.I000lI(4L)) {
/* 197 */               throw new EOFException("Unterminated escape sequence at path " + getPath());
                    }
/* 97 */            int i2 = 0;
/* 98 */            char c = 0;
                    while (true) {
/* 99 */                III1o0lOio0 iII1o0lOio0 = this.buffer;
/* 102 */               if (i2 >= 4) {
/* 170 */                   iII1o0lOio0.skip(4L);
/* 173 */                   return c;
                        }
/* 105 */               byte bI000O01llI0 = iII1o0lOio0.I000O01llI0(i2);
/* 111 */               char c2 = (char) (c << 4);
/* 114 */               if (bI000O01llI0 >= 48 && bI000O01llI0 <= 57) {
                            i = bI000O01llI0 - 48;
                        } else if (bI000O01llI0 >= 97 && bI000O01llI0 <= 102) {
                            i = bI000O01llI0 - 87;
                        } else {
/* 136 */                   if (bI000O01llI0 < 65 || bI000O01llI0 > 70) {
                                break;
                            }
                            i = bI000O01llI0 - 55;
                        }
/* 123 */               c = (char) (i + c2);
/* 145 */               i2++;
                    }
/* 148 */           III1o0lOio0 iII1o0lOio02 = this.buffer;
/* 150 */           iII1o0lOio02.getClass();
/* 169 */           throw syntaxError("\\u".concat(iII1o0lOio02.I00OOll1(4L, IO1IOI.I00000oIO)));
                }

                private void skipQuotedValue(IIOIIi1ilIO iIOIIi1ilIO) throws O01Ol0I, EOFException {
                    while (true) {
/* 3 */                 long jI00IlilI0i0i = this.source.I00IlilI0i0i(iIOIIi1ilIO);
/* 11 */                if (jI00IlilI0i0i == -1) {
/* 49 */                    throw syntaxError("Unterminated string");
                        }
/* 15 */                byte bI000O01llI0 = this.buffer.I000O01llI0(jI00IlilI0i0i);
/* 19 */                III1o0lOio0 iII1o0lOio0 = this.buffer;
/* 25 */                if (bI000O01llI0 != 92) {
/* 36 */                    iII1o0lOio0.skip(jI00IlilI0i0i + 1);
/* 39 */                    return;
                        } else {
/* 28 */                    iII1o0lOio0.skip(jI00IlilI0i0i + 1);
/* 31 */                    readEscapeCharacter();
                        }
                    }
                }

                private boolean skipToEndOfBlockComment() throws EOFException {
/* 5 */             long jI0010I0i = this.source.I0010I0i(CLOSING_BLOCK_COMMENT);
/* 17 */            boolean z = jI0010I0i != -1;
/* 18 */            III1o0lOio0 iII1o0lOio0 = this.buffer;
/* 31 */            iII1o0lOio0.skip(z ? jI0010I0i + r1.I00000oOI() : iII1o0lOio0.I00iiI);
/* 113 */           return z;
                }

                private void skipToEndOfLine() throws EOFException {
/* 5 */             long jI00IlilI0i0i = this.source.I00IlilI0i0i(LINEFEED_OR_CARRIAGE_RETURN);
/* 9 */             III1o0lOio0 iII1o0lOio0 = this.buffer;
/* 23 */            iII1o0lOio0.skip(jI00IlilI0i0i != -1 ? jI00IlilI0i0i + 1 : iII1o0lOio0.I00iiI);
                }

                private void skipUnquotedValue() throws EOFException {
/* 5 */             long jI00IlilI0i0i = this.source.I00IlilI0i0i(UNQUOTED_STRING_TERMINALS);
/* 9 */             III1o0lOio0 iII1o0lOio0 = this.buffer;
/* 15 */            if (jI00IlilI0i0i == -1) {
/* 18 */                jI00IlilI0i0i = iII1o0lOio0.I00iiI;
                    }
/* 20 */            iII1o0lOio0.skip(jI00IlilI0i0i);
                }

                @Override
                public void beginArray() throws O01Ol0I, EOFException {
/* 1 */             int iDoPeek = this.peeked;
/* 3 */             if (iDoPeek == 0) {
/* 5 */                 iDoPeek = doPeek();
                    }
/* 10 */            if (iDoPeek == 3) {
/* 13 */                pushScope(1);
/* 22 */                this.pathIndices[this.stackSize - 1] = 0;
/* 24 */                this.peeked = 0;
                    } else {
/* 31 */                StringBuilder sb = new StringBuilder("Expected BEGIN_ARRAY but was ");
/* 38 */                sb.append(peek());
/* 47 */                IoOOl0iOl1io.I00100o1O0lo(sb, " at path ", getPath());
                    }
                }

                @Override
                public void beginObject() throws O01Ol0I, EOFException {
/* 1 */             int iDoPeek = this.peeked;
/* 3 */             if (iDoPeek == 0) {
/* 5 */                 iDoPeek = doPeek();
                    }
/* 10 */            if (iDoPeek == 1) {
/* 13 */                pushScope(3);
/* 17 */                this.peeked = 0;
                    } else {
/* 24 */                StringBuilder sb = new StringBuilder("Expected BEGIN_OBJECT but was ");
/* 31 */                sb.append(peek());
/* 40 */                IoOOl0iOl1io.I00100o1O0lo(sb, " at path ", getPath());
                    }
                }

                @Override
                public void close() throws IOException {
/* 2 */             this.peeked = 0;
/* 8 */             this.scopes[0] = 8;
/* 11 */            this.stackSize = 1;
/* 15 */            this.buffer.I00000oIO();
/* 20 */            this.source.close();
                }

                @Override
                public void endArray() throws O01Ol0I, EOFException {
/* 1 */             int iDoPeek = this.peeked;
/* 3 */             if (iDoPeek == 0) {
/* 5 */                 iDoPeek = doPeek();
                    }
/* 10 */            if (iDoPeek != 4) {
/* 36 */                StringBuilder sb = new StringBuilder("Expected END_ARRAY but was ");
/* 43 */                sb.append(peek());
/* 52 */                IoOOl0iOl1io.I00100o1O0lo(sb, " at path ", getPath());
                    } else {
/* 12 */                int i = this.stackSize;
/* 16 */                this.stackSize = i - 1;
/* 18 */                int[] iArr = this.pathIndices;
                        int i2 = i - 2;
/* 26 */                iArr[i2] = iArr[i2] + 1;
/* 29 */                this.peeked = 0;
                    }
                }

                @Override
                public void endObject() throws O01Ol0I, EOFException {
/* 1 */             int iDoPeek = this.peeked;
/* 3 */             if (iDoPeek == 0) {
/* 5 */                 iDoPeek = doPeek();
                    }
/* 10 */            if (iDoPeek != 2) {
/* 40 */                StringBuilder sb = new StringBuilder("Expected END_OBJECT but was ");
/* 47 */                sb.append(peek());
/* 56 */                IoOOl0iOl1io.I00100o1O0lo(sb, " at path ", getPath());
/* 113 */               return;
                    }
/* 12 */            int i = this.stackSize;
                    int i2 = i - 1;
/* 16 */            this.stackSize = i2;
/* 21 */            this.pathNames[i2] = null;
/* 23 */            int[] iArr = this.pathIndices;
/* 25 */            int i3 = i - 2;
/* 30 */            iArr[i3] = iArr[i3] + 1;
/* 33 */            this.peeked = 0;
                }

                @Override
                public boolean hasNext() throws O01Ol0I, EOFException {
/* 1 */             int iDoPeek = this.peeked;
/* 3 */             if (iDoPeek == 0) {
/* 5 */                 iDoPeek = doPeek();
                    }
                    return (iDoPeek == 2 || iDoPeek == 4 || iDoPeek == 18) ? false : true;
                }

                @Override
                public boolean nextBoolean() throws O01Ol0I, EOFException {
/* 1 */             int iDoPeek = this.peeked;
/* 3 */             if (iDoPeek == 0) {
/* 5 */                 iDoPeek = doPeek();
                    }
/* 12 */            if (iDoPeek == 5) {
/* 14 */                this.peeked = 0;
/* 16 */                int[] iArr = this.pathIndices;
/* 20 */                int i = this.stackSize - 1;
/* 24 */                iArr[i] = iArr[i] + 1;
/* 11 */                return true;
                    }
/* 28 */            if (iDoPeek != 6) {
/* 47 */                StringBuilder sb = new StringBuilder("Expected a boolean but was ");
/* 54 */                sb.append(peek());
/* 63 */                IoOOl0iOl1io.I00100o1O0lo(sb, " at path ", getPath());
/* 10 */                return false;
                    }
/* 30 */            this.peeked = 0;
/* 32 */            int[] iArr2 = this.pathIndices;
/* 36 */            int i2 = this.stackSize - 1;
/* 40 */            iArr2[i2] = iArr2[i2] + 1;
/* 10 */            return false;
                }

                @Override
                public double nextDouble() throws O01Ol0I, NumberFormatException, EOFException {
/* 1 */             int iDoPeek = this.peeked;
/* 3 */             if (iDoPeek == 0) {
/* 5 */                 iDoPeek = doPeek();
                    }
/* 12 */            if (iDoPeek == 16) {
/* 14 */                this.peeked = 0;
/* 16 */                int[] iArr = this.pathIndices;
                        int i = this.stackSize - 1;
/* 26 */                iArr[i] = iArr[i] + 1;
/* 30 */                return this.peekedLong;
                    }
/* 42 */            if (iDoPeek == 17) {
/* 44 */                III1o0lOio0 iII1o0lOio0 = this.buffer;
/* 46 */                long j = this.peekedNumberLength;
/* 49 */                iII1o0lOio0.getClass();
/* 58 */                this.peekedString = iII1o0lOio0.I00OOll1(j, IO1IOI.I00000oIO);
                    } else if (iDoPeek == 9) {
/* 71 */                this.peekedString = nextQuotedValue(DOUBLE_QUOTE_OR_SLASH);
                    } else if (iDoPeek == 8) {
/* 84 */                this.peekedString = nextQuotedValue(SINGLE_QUOTE_OR_SLASH);
                    } else if (iDoPeek == 10) {
/* 95 */                this.peekedString = nextUnquotedValue();
                    } else if (iDoPeek != 11) {
/* 185 */               StringBuilder sb = new StringBuilder("Expected a double but was ");
/* 192 */               sb.append(peek());
/* 199 */               IoOOl0iOl1io.I00100o1O0lo(sb, " at path ", getPath());
/* 34 */                return 0.0d;
                    }
/* 100 */           this.peeked = 11;
                    try {
/* 104 */               double d = Double.parseDouble(this.peekedString);
/* 110 */               if (this.lenient || !(Double.isNaN(d) || Double.isInfinite(d))) {
/* 156 */                   this.peekedString = null;
/* 158 */                   this.peeked = 0;
/* 160 */                   int[] iArr2 = this.pathIndices;
                            int i2 = this.stackSize - 1;
/* 170 */                   iArr2[i2] = iArr2[i2] + 1;
/* 172 */                   return d;
                        }
/* 154 */               throw new O01Ol0I("JSON forbids NaN and infinities: " + d + " at path " + getPath());
                    } catch (NumberFormatException unused) {
/* 179 */               IoOOl0iOl1io.I0000oI00(this.peekedString, "Expected a double but was ", getPath());
/* 34 */                return 0.0d;
                    }
                }

                @Override
                public int nextInt() throws O01Ol0I, NumberFormatException, EOFException {
/* 1 */             int iDoPeek = this.peeked;
/* 3 */             if (iDoPeek == 0) {
/* 5 */                 iDoPeek = doPeek();
                    }
/* 16 */            if (iDoPeek == 16) {
/* 18 */                long j = this.peekedLong;
/* 20 */                int i = (int) j;
/* 24 */                if (j == i) {
/* 26 */                    this.peeked = 0;
/* 28 */                    int[] iArr = this.pathIndices;
                            int i2 = this.stackSize - 1;
/* 38 */                    iArr[i2] = iArr[i2] + 1;
/* 40 */                    return i;
                        }
/* 70 */                throw new O01IiOo11l1o("Expected an int but was " + this.peekedLong + " at path " + getPath());
                    }
/* 75 */            if (iDoPeek == 17) {
/* 77 */                III1o0lOio0 iII1o0lOio0 = this.buffer;
/* 79 */                long j2 = this.peekedNumberLength;
/* 82 */                iII1o0lOio0.getClass();
/* 91 */                this.peekedString = iII1o0lOio0.I00OOll1(j2, IO1IOI.I00000oIO);
                    } else if (iDoPeek == 9 || iDoPeek == 8) {
/* 137 */               String strNextQuotedValue = iDoPeek == 9 ? nextQuotedValue(DOUBLE_QUOTE_OR_SLASH) : nextQuotedValue(SINGLE_QUOTE_OR_SLASH);
/* 141 */               this.peekedString = strNextQuotedValue;
                        try {
/* 143 */                   int i3 = Integer.parseInt(strNextQuotedValue);
/* 147 */                   this.peeked = 0;
/* 149 */                   int[] iArr2 = this.pathIndices;
                            int i4 = this.stackSize - 1;
/* 159 */                   iArr2[i4] = iArr2[i4] + 1;
/* 161 */                   return i3;
                        } catch (NumberFormatException unused) {
                        }
                    } else if (iDoPeek != 11) {
/* 108 */               StringBuilder sb = new StringBuilder("Expected an int but was ");
/* 115 */               sb.append(peek());
/* 122 */               IoOOl0iOl1io.I00100o1O0lo(sb, " at path ", getPath());
/* 11 */                return 0;
                    }
/* 162 */           this.peeked = 11;
                    try {
/* 166 */               double d = Double.parseDouble(this.peekedString);
/* 170 */               int i5 = (int) d;
/* 174 */               if (i5 != d) {
/* 200 */                   IoOOl0iOl1io.I0000oI00(this.peekedString, "Expected an int but was ", getPath());
/* 11 */                    return 0;
                        }
/* 177 */               this.peekedString = null;
/* 179 */               this.peeked = 0;
/* 181 */               int[] iArr3 = this.pathIndices;
                        int i6 = this.stackSize - 1;
/* 191 */               iArr3[i6] = iArr3[i6] + 1;
/* 193 */               return i5;
                    } catch (NumberFormatException unused2) {
/* 210 */               IoOOl0iOl1io.I0000oI00(this.peekedString, "Expected an int but was ", getPath());
/* 11 */                return 0;
                    }
                }

                @Override
                public long nextLong() throws O01Ol0I, NumberFormatException, EOFException {
/* 1 */             int iDoPeek = this.peeked;
/* 3 */             if (iDoPeek == 0) {
/* 5 */                 iDoPeek = doPeek();
                    }
/* 12 */            if (iDoPeek == 16) {
/* 14 */                this.peeked = 0;
/* 16 */                int[] iArr = this.pathIndices;
                        int i = this.stackSize - 1;
/* 26 */                iArr[i] = iArr[i] + 1;
/* 28 */                return this.peekedLong;
                    }
/* 39 */            if (iDoPeek == 17) {
/* 41 */                III1o0lOio0 iII1o0lOio0 = this.buffer;
/* 43 */                long j = this.peekedNumberLength;
/* 46 */                iII1o0lOio0.getClass();
/* 55 */                this.peekedString = iII1o0lOio0.I00OOll1(j, IO1IOI.I00000oIO);
                    } else if (iDoPeek == 9 || iDoPeek == 8) {
/* 103 */               String strNextQuotedValue = iDoPeek == 9 ? nextQuotedValue(DOUBLE_QUOTE_OR_SLASH) : nextQuotedValue(SINGLE_QUOTE_OR_SLASH);
/* 107 */               this.peekedString = strNextQuotedValue;
                        try {
/* 109 */                   long j2 = Long.parseLong(strNextQuotedValue);
/* 113 */                   this.peeked = 0;
/* 115 */                   int[] iArr2 = this.pathIndices;
                            int i2 = this.stackSize - 1;
/* 125 */                   iArr2[i2] = iArr2[i2] + 1;
/* 127 */                   return j2;
                        } catch (NumberFormatException unused) {
                        }
                    } else if (iDoPeek != 11) {
/* 72 */                StringBuilder sb = new StringBuilder("Expected a long but was ");
/* 79 */                sb.append(peek());
/* 88 */                IoOOl0iOl1io.I00100o1O0lo(sb, " at path ", getPath());
/* 33 */                return 0L;
                    }
/* 128 */           this.peeked = 11;
                    try {
/* 137 */               long jLongValueExact = new BigDecimal(this.peekedString).longValueExact();
/* 142 */               this.peekedString = null;
/* 144 */               this.peeked = 0;
/* 146 */               int[] iArr3 = this.pathIndices;
                        int i3 = this.stackSize - 1;
/* 156 */               iArr3[i3] = iArr3[i3] + 1;
/* 158 */               return jLongValueExact;
                    } catch (ArithmeticException | NumberFormatException unused2) {
/* 165 */               IoOOl0iOl1io.I0000oI00(this.peekedString, "Expected a long but was ", getPath());
/* 33 */                return 0L;
                    }
                }

                @Override
                public String nextName() throws O01Ol0I, EOFException {
                    String strNextQuotedValue;
/* 1 */             int iDoPeek = this.peeked;
/* 3 */             if (iDoPeek == 0) {
/* 5 */                 iDoPeek = doPeek();
                    }
/* 11 */            if (iDoPeek == 14) {
/* 13 */                strNextQuotedValue = nextUnquotedValue();
                    } else if (iDoPeek == 13) {
/* 24 */                strNextQuotedValue = nextQuotedValue(DOUBLE_QUOTE_OR_SLASH);
                    } else if (iDoPeek == 12) {
/* 35 */                strNextQuotedValue = nextQuotedValue(SINGLE_QUOTE_OR_SLASH);
                    } else {
/* 42 */                if (iDoPeek != 15) {
/* 65 */                    StringBuilder sb = new StringBuilder("Expected a name but was ");
/* 72 */                    sb.append(peek());
/* 81 */                    IoOOl0iOl1io.I00100o1O0lo(sb, " at path ", getPath());
/* 84 */                    return null;
                        }
/* 44 */                strNextQuotedValue = this.peekedString;
/* 47 */                this.peekedString = null;
                    }
/* 50 */            this.peeked = 0;
/* 58 */            this.pathNames[this.stackSize - 1] = strNextQuotedValue;
/* 60 */            return strNextQuotedValue;
                }

                @Override
                public <T> T nextNull() throws O01Ol0I, EOFException {
/* 1 */             int iDoPeek = this.peeked;
/* 3 */             if (iDoPeek == 0) {
/* 5 */                 iDoPeek = doPeek();
                    }
/* 11 */            if (iDoPeek != 7) {
/* 33 */                StringBuilder sb = new StringBuilder("Expected null but was ");
/* 40 */                sb.append(peek());
/* 49 */                IoOOl0iOl1io.I00100o1O0lo(sb, " at path ", getPath());
/* 10 */                return null;
                    }
/* 14 */            this.peeked = 0;
/* 16 */            int[] iArr = this.pathIndices;
                    int i = this.stackSize - 1;
/* 26 */            iArr[i] = iArr[i] + 1;
/* 10 */            return null;
                }

                /* JADX WARN: Removed duplicated region for block: B:50:0x00ae  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public IIIIlO11I0lO nextSource() throws IOException {
                    int i;
/* 1 */             int iDoPeek = this.peeked;
/* 3 */             if (iDoPeek == 0) {
/* 5 */                 iDoPeek = doPeek();
                    }
/* 11 */            III1o0lOio0 iII1o0lOio0 = new III1o0lOio0();
/* 14 */            IIOIIi1ilIO iIOIIi1ilIO = O01oiO0l.STATE_END_OF_JSON;
/* 21 */            if (iDoPeek == 3) {
/* 25 */                iII1o0lOio0.I00oo1iO0ll("[");
/* 28 */                iIOIIi1ilIO = O01oiO0l.STATE_JSON;
                    } else {
/* 33 */                if (iDoPeek != 1) {
/* 43 */                    if (iDoPeek == 9) {
/* 47 */                        iII1o0lOio0.I00oo1iO0ll("\"");
/* 50 */                        iIOIIi1ilIO = O01oiO0l.STATE_DOUBLE_QUOTED;
                            } else if (iDoPeek == 8) {
/* 61 */                        iII1o0lOio0.I00oo1iO0ll("'");
/* 64 */                        iIOIIi1ilIO = O01oiO0l.STATE_SINGLE_QUOTED;
                            } else if (iDoPeek == 17 || iDoPeek == 16 || iDoPeek == 10) {
/* 167 */                       iII1o0lOio0.I00oo1iO0ll(nextString());
                            } else if (iDoPeek == 5) {
/* 85 */                        iII1o0lOio0.I00oo1iO0ll("true");
                            } else if (iDoPeek == 6) {
/* 94 */                        iII1o0lOio0.I00oo1iO0ll("false");
                            } else if (iDoPeek == 7) {
/* 103 */                       iII1o0lOio0.I00oo1iO0ll("null");
                            } else {
/* 109 */                       if (iDoPeek != 11) {
/* 142 */                           StringBuilder sb = new StringBuilder("Expected a value but was ");
/* 149 */                           sb.append(peek());
/* 158 */                           IoOOl0iOl1io.I00100o1O0lo(sb, " at path ", getPath());
/* 161 */                           return null;
                                }
/* 111 */                       String strNextString = nextString();
/* 115 */                       O01ooIO00oio o01ooIO00oioOf = O01ooIO00oio.of(iII1o0lOio0);
                                try {
/* 119 */                           o01ooIO00oioOf.value(strNextString);
/* 122 */                           o01ooIO00oioOf.close();
                                } catch (Throwable th) {
/* 127 */                           if (o01ooIO00oioOf != null) {
                                        try {
/* 129 */                                   o01ooIO00oioOf.close();
                                        } catch (Throwable th2) {
/* 134 */                                   th.addSuppressed(th2);
                                        }
                                    }
/* 137 */                           throw th;
                                }
                            }
/* 52 */                    i = 0;
/* 173 */                   if (this.peeked != 0) {
/* 175 */                       int[] iArr = this.pathIndices;
/* 179 */                       int i2 = this.stackSize - 1;
/* 183 */                       iArr[i2] = iArr[i2] + 1;
/* 185 */                       this.peeked = 0;
                            }
/* 194 */                   this.valueSource = new O01oiO0l(this.source, iII1o0lOio0, iIOIIi1ilIO, i);
/* 196 */                   pushScope(9);
/* 203 */                   return new OOliO0(this.valueSource);
                        }
/* 37 */                iII1o0lOio0.I00oo1iO0ll("{");
/* 40 */                iIOIIi1ilIO = O01oiO0l.STATE_JSON;
                    }
/* 30 */            i = 1;
/* 173 */           if (this.peeked != 0) {
                    }
/* 194 */           this.valueSource = new O01oiO0l(this.source, iII1o0lOio0, iIOIIi1ilIO, i);
/* 196 */           pushScope(9);
/* 203 */           return new OOliO0(this.valueSource);
                }

                @Override
                public String nextString() throws O01Ol0I, EOFException {
                    String strI00OOll1;
/* 1 */             int iDoPeek = this.peeked;
/* 3 */             if (iDoPeek == 0) {
/* 5 */                 iDoPeek = doPeek();
                    }
/* 11 */            if (iDoPeek == 10) {
/* 13 */                strI00OOll1 = nextUnquotedValue();
                    } else if (iDoPeek == 9) {
/* 24 */                strI00OOll1 = nextQuotedValue(DOUBLE_QUOTE_OR_SLASH);
                    } else if (iDoPeek == 8) {
/* 35 */                strI00OOll1 = nextQuotedValue(SINGLE_QUOTE_OR_SLASH);
                    } else if (iDoPeek == 11) {
/* 45 */                strI00OOll1 = this.peekedString;
/* 47 */                this.peekedString = null;
                    } else if (iDoPeek == 16) {
/* 56 */                strI00OOll1 = Long.toString(this.peekedLong);
                    } else {
/* 63 */                if (iDoPeek != 17) {
/* 99 */                    StringBuilder sb = new StringBuilder("Expected a string but was ");
/* 106 */                   sb.append(peek());
/* 115 */                   IoOOl0iOl1io.I00100o1O0lo(sb, " at path ", getPath());
/* 42 */                    return null;
                        }
/* 65 */                III1o0lOio0 iII1o0lOio0 = this.buffer;
/* 67 */                long j = this.peekedNumberLength;
/* 70 */                iII1o0lOio0.getClass();
/* 75 */                strI00OOll1 = iII1o0lOio0.I00OOll1(j, IO1IOI.I00000oIO);
                    }
/* 80 */            this.peeked = 0;
/* 82 */            int[] iArr = this.pathIndices;
                    int i = this.stackSize - 1;
/* 92 */            iArr[i] = iArr[i] + 1;
/* 94 */            return strI00OOll1;
                }

                @Override
                public O01lo1il.I00000oOI peek() throws O01Ol0I, EOFException {
/* 1 */             int iDoPeek = this.peeked;
/* 3 */             if (iDoPeek == 0) {
/* 5 */                 iDoPeek = doPeek();
                    }
                    switch (iDoPeek) {
                        case 1:
/* 44 */                    return O01lo1il.I00000oOI.BEGIN_OBJECT;
                        case 2:
/* 41 */                    return O01lo1il.I00000oOI.END_OBJECT;
                        case 3:
/* 38 */                    return O01lo1il.I00000oOI.BEGIN_ARRAY;
                        case 4:
/* 35 */                    return O01lo1il.I00000oOI.END_ARRAY;
                        case 5:
                        case 6:
/* 32 */                    return O01lo1il.I00000oOI.BOOLEAN;
                        case 7:
/* 29 */                    return O01lo1il.I00000oOI.NULL;
                        case 8:
                        case 9:
                        case 10:
                        case 11:
/* 26 */                    return O01lo1il.I00000oOI.STRING;
                        case 12:
                        case 13:
                        case 14:
                        case 15:
/* 23 */                    return O01lo1il.I00000oOI.NAME;
                        case 16:
                        case 17:
/* 20 */                    return O01lo1il.I00000oOI.NUMBER;
                        case 18:
/* 17 */                    return O01lo1il.I00000oOI.END_DOCUMENT;
                        default:
/* 12 */                    OoOil11Ol1o.I0000Il00O();
/* 15 */                    return null;
                    }
                }

                @Override
                public O01lo1il peekJson() {
/* 3 */             return new O01o1ol0OI1(this);
                }

                @Override
                public void promoteNameToValue() {
/* 5 */             if (hasNext()) {
/* 11 */                this.peekedString = nextName();
/* 15 */                this.peeked = 11;
                    }
                }

                @Override
                public int selectName(O01lo1il.I00000oIO i00000oIO) throws O01Ol0I, EOFException {
/* 1 */             int iDoPeek = this.peeked;
/* 3 */             if (iDoPeek == 0) {
/* 5 */                 iDoPeek = doPeek();
                    }
/* 12 */            if (iDoPeek < 12 || iDoPeek > 15) {
/* 11 */                return -1;
                    }
/* 19 */            if (iDoPeek == 15) {
/* 23 */                return findName(this.peekedString, i00000oIO);
                    }
/* 32 */            int iI00IO1oi11O = this.source.I00IO1oi11O(i00000oIO.doubleQuoteSuffix);
/* 36 */            if (iI00IO1oi11O != -1) {
/* 39 */                this.peeked = 0;
/* 51 */                this.pathNames[this.stackSize - 1] = i00000oIO.strings[iI00IO1oi11O];
/* 53 */                return iI00IO1oi11O;
                    }
/* 60 */            String str = this.pathNames[this.stackSize - 1];
/* 62 */            String strNextName = nextName();
/* 66 */            int iFindName = findName(strNextName, i00000oIO);
/* 70 */            if (iFindName == -1) {
/* 72 */                this.peeked = 15;
/* 74 */                this.peekedString = strNextName;
/* 82 */                this.pathNames[this.stackSize - 1] = str;
                    }
/* 84 */            return iFindName;
                }

                @Override
                public int selectString(O01lo1il.I00000oIO i00000oIO) throws O01Ol0I, EOFException {
/* 1 */             int iDoPeek = this.peeked;
/* 3 */             if (iDoPeek == 0) {
/* 5 */                 iDoPeek = doPeek();
                    }
/* 12 */            if (iDoPeek < 8 || iDoPeek > 11) {
/* 11 */                return -1;
                    }
/* 19 */            if (iDoPeek == 11) {
/* 23 */                return findString(this.peekedString, i00000oIO);
                    }
/* 32 */            int iI00IO1oi11O = this.source.I00IO1oi11O(i00000oIO.doubleQuoteSuffix);
/* 36 */            if (iI00IO1oi11O != -1) {
/* 39 */                this.peeked = 0;
/* 41 */                int[] iArr = this.pathIndices;
                        int i = this.stackSize - 1;
/* 51 */                iArr[i] = iArr[i] + 1;
/* 53 */                return iI00IO1oi11O;
                    }
/* 54 */            String strNextString = nextString();
/* 58 */            int iFindString = findString(strNextString, i00000oIO);
/* 62 */            if (iFindString == -1) {
/* 64 */                this.peeked = 11;
/* 66 */                this.peekedString = strNextString;
/* 78 */                this.pathIndices[this.stackSize - 1] = r0[r4] - 1;
                    }
/* 80 */            return iFindString;
                }

                @Override
                public void skipName() throws O01Ol0I, EOFException {
/* 3 */             if (this.failOnUnknown) {
/* 83 */                O01lo1il.I00000oOI i00000oOIPeek = peek();
/* 87 */                nextName();
/* 94 */                StringBuilder sb = new StringBuilder("Cannot skip unexpected ");
/* 97 */                sb.append(i00000oOIPeek);
/* 106 */               IoOOl0iOl1io.I00100o1O0lo(sb, " at ", getPath());
/* 113 */               return;
                    }
/* 5 */             int iDoPeek = this.peeked;
/* 7 */             if (iDoPeek == 0) {
/* 9 */                 iDoPeek = doPeek();
                    }
/* 15 */            if (iDoPeek == 14) {
/* 17 */                skipUnquotedValue();
                    } else if (iDoPeek == 13) {
/* 27 */                skipQuotedValue(DOUBLE_QUOTE_OR_SLASH);
                    } else if (iDoPeek == 12) {
/* 37 */                skipQuotedValue(SINGLE_QUOTE_OR_SLASH);
                    } else if (iDoPeek != 15) {
/* 63 */                StringBuilder sb2 = new StringBuilder("Expected a name but was ");
/* 70 */                sb2.append(peek());
/* 79 */                IoOOl0iOl1io.I00100o1O0lo(sb2, " at path ", getPath());
/* 82 */                return;
                    }
/* 46 */            this.peeked = 0;
/* 56 */            this.pathNames[this.stackSize - 1] = "null";
                }

                @Override
                public void skipValue() throws O01Ol0I, EOFException {
/* 3 */             if (this.failOnUnknown) {
/* 210 */               StringBuilder sb = new StringBuilder("Cannot skip unexpected ");
/* 217 */               sb.append(peek());
/* 226 */               IoOOl0iOl1io.I00100o1O0lo(sb, " at ", getPath());
/* 541 */               return;
                    }
/* 6 */             int i = 0;
/* 185 */           do {
/* 7 */                 int iDoPeek = this.peeked;
/* 9 */                 if (iDoPeek == 0) {
/* 11 */                    iDoPeek = doPeek();
                        }
/* 17 */                if (iDoPeek == 3) {
/* 19 */                    pushScope(1);
                        } else if (iDoPeek == 1) {
/* 28 */                    pushScope(3);
                        } else {
/* 37 */                    if (iDoPeek == 4) {
                                i--;
/* 41 */                        if (i < 0) {
/* 52 */                            StringBuilder sb2 = new StringBuilder("Expected a value but was ");
/* 59 */                            sb2.append(peek());
/* 66 */                            IoOOl0iOl1io.I00100o1O0lo(sb2, " at path ", getPath());
/* 69 */                            return;
                                }
                                this.stackSize--;
                            } else if (iDoPeek == 2) {
                                i--;
/* 75 */                        if (i < 0) {
/* 85 */                            StringBuilder sb3 = new StringBuilder("Expected a value but was ");
/* 92 */                            sb3.append(peek());
/* 99 */                            IoOOl0iOl1io.I00100o1O0lo(sb3, " at path ", getPath());
/* 102 */                           return;
                                }
                                this.stackSize--;
                            } else if (iDoPeek == 14 || iDoPeek == 10) {
/* 180 */                       skipUnquotedValue();
                            } else if (iDoPeek == 9 || iDoPeek == 13) {
/* 176 */                       skipQuotedValue(DOUBLE_QUOTE_OR_SLASH);
                            } else if (iDoPeek == 8 || iDoPeek == 12) {
/* 170 */                       skipQuotedValue(SINGLE_QUOTE_OR_SLASH);
                            } else if (iDoPeek == 17) {
/* 139 */                       this.buffer.skip(this.peekedNumberLength);
                            } else if (iDoPeek == 18) {
/* 150 */                       StringBuilder sb4 = new StringBuilder("Expected a value but was ");
/* 157 */                       sb4.append(peek());
/* 164 */                       IoOOl0iOl1io.I00100o1O0lo(sb4, " at path ", getPath());
/* 167 */                       return;
                            }
/* 183 */                   this.peeked = 0;
                        }
/* 22 */                i++;
/* 183 */               this.peeked = 0;
/* 185 */           } while (i != 0);
/* 187 */           int[] iArr = this.pathIndices;
/* 189 */           int i2 = this.stackSize;
                    int i3 = i2 - 1;
/* 196 */           iArr[i3] = iArr[i3] + 1;
/* 203 */           this.pathNames[i2 - 1] = "null";
                }

                public String toString() {
/* 18 */            return "JsonReader(" + this.source + ")";
                }

/* 47 */        public O01o1ol0OI1(IIIIlO11I0lO iIIIlO11I0lO) {
/* 49 */            this.peeked = 0;
                    if (iIIIlO11I0lO != null) {
/* 50 */                this.source = iIIIlO11I0lO;
/* 51 */                this.buffer = iIIIlO11I0lO.I0000oI00();
/* 52 */                pushScope(6);
                        return;
                    }
/* 53 */            IOOlIIilOl0.I000II("source == null");
                    throw null;
                }
            }
