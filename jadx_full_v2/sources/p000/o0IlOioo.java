            package p000;

            import java.io.Closeable;
            import java.io.EOFException;
            import java.io.IOException;
            import java.io.StringReader;
            import java.util.Arrays;
            
            public final class o0IlOioo implements Closeable {
                public StringReader I00iOIl;
                public int I00iiI;
                public char[] I00iiO;
                public int I00iio;
                public int I00ilI0I1;
                public int I00ilO0;
                public int I00io1l;
                public int I00ioIO;
                public long I00l0I0l0lO1;
                public int I00l0OO0IO;
                public String I00li1OI;
                public int[] I00ll1;
                public int I00lli11;
                public String[] I00lll10;
                public int[] I00o0iI0io1;

                static {
/* 8 */             Iioi0lilII.I00lll10 = new Iioi0lilII(28);
                }

                public final void I00000oIO(int i) throws o0IoiOl {
/* 1 */             int i2 = this.I00lli11;
/* 7 */             if (i2 - 1 >= 1280) {
/* 52 */                String strI00oo1iO0ll = I00oo1iO0ll();
/* 77 */                throw new o0IoiOl(IIl001iO0Io.I00100l0(new StringBuilder(strI00oo1iO0ll.length() + 26), "Nesting limit 1280 reached", strI00oo1iO0ll));
                    }
/* 9 */             int[] iArr = this.I00ll1;
/* 12 */            if (i2 == iArr.length) {
/* 14 */                int i3 = i2 + i2;
/* 19 */                this.I00ll1 = Arrays.copyOf(iArr, i3);
/* 27 */                this.I00o0iI0io1 = Arrays.copyOf(this.I00o0iI0io1, i3);
/* 37 */                this.I00lll10 = (String[]) Arrays.copyOf(this.I00lll10, i3);
                    }
/* 39 */            int[] iArr2 = this.I00ll1;
/* 41 */            int i4 = this.I00lli11;
/* 45 */            this.I00lli11 = i4 + 1;
/* 47 */            iArr2[i4] = i;
                }

                public final boolean I0000Il00O(int i) throws IOException {
                    int i2;
/* 1 */             int i3 = this.I00io1l;
/* 3 */             int i4 = this.I00iio;
/* 6 */             this.I00io1l = i3 - i4;
/* 8 */             char[] cArr = this.I00iiO;
/* 10 */            int i5 = this.I00ilI0I1;
/* 13 */            if (i5 != i4) {
/* 15 */                int i6 = i5 - i4;
/* 16 */                this.I00ilI0I1 = i6;
/* 18 */                System.arraycopy(cArr, i4, cArr, 0, i6);
                    } else {
/* 22 */                this.I00ilI0I1 = 0;
                    }
/* 24 */            this.I00iio = 0;
/* 71 */            do {
/* 26 */                StringReader stringReader = this.I00iOIl;
/* 28 */                int i7 = this.I00ilI0I1;
/* 32 */                int i8 = stringReader.read(cArr, i7, 1024 - i7);
/* 37 */                if (i8 == -1) {
/* 12 */                    return false;
                        }
/* 41 */                i2 = this.I00ilI0I1 + i8;
/* 42 */                this.I00ilI0I1 = i2;
/* 47 */                if (this.I00ilO0 == 0 && this.I00io1l == 0 && i2 > 0 && cArr[0] == 65279) {
                            this.I00iio++;
/* 67 */                    this.I00io1l = 1;
/* 69 */                    i++;
                        }
/* 71 */            } while (i2 < i);
/* 46 */            return true;
                }

                /* JADX WARN: Code restructure failed: missing block: B:33:0x006c, code lost:
                
                    return 47;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final int I000II(boolean z) throws IOException {
                    int i;
/* 1 */             int i2 = this.I00iio;
/* 3 */             int i3 = this.I00ilI0I1;
                    while (true) {
/* 6 */                 if (i2 == i3) {
/* 8 */                     this.I00iio = i2;
/* 14 */                    if (!I0000Il00O(1)) {
/* 16 */                        if (z) {
/* 35 */                            throw new EOFException("End of input".concat(I00oo1iO0ll()));
                                }
/* 18 */                        return -1;
                            }
/* 36 */                    i2 = this.I00iio;
/* 38 */                    i3 = this.I00ilI0I1;
                        }
/* 40 */                char[] cArr = this.I00iiO;
/* 42 */                int i4 = i2 + 1;
/* 44 */                char c = cArr[i2];
/* 48 */                if (c == '\n') {
                            this.I00ilO0++;
/* 55 */                    this.I00io1l = i4;
                        } else if (c != ' ' && c != '\r' && c != '\t') {
/* 75 */                    if (c == '/') {
/* 77 */                        this.I00iio = i4;
/* 80 */                        if (i4 == i3) {
/* 82 */                            this.I00iio = i2;
/* 84 */                            boolean zI0000Il00O = I0000Il00O(2);
                                    this.I00iio++;
/* 93 */                            if (!zI0000Il00O) {
                                        break;
                                    }
                                    break;
                                    break;
                                }
/* 96 */                        I000O01llI0();
/* 99 */                        int i5 = this.I00iio;
/* 101 */                       char c2 = cArr[i5];
/* 105 */                       if (c2 == '*') {
/* 124 */                           this.I00iio = i5 + 1;
                                    while (true) {
/* 131 */                               if (this.I00iio + 2 > this.I00ilI0I1 && !I0000Il00O(2)) {
/* 142 */                                   I001l0I00("Unterminated comment");
/* 146 */                                   throw null;
                                        }
/* 147 */                               int i6 = this.I00iio;
/* 151 */                               if (cArr[i6] != '\n') {
                                            while (true) {
/* 164 */                                       int i7 = this.I00iio;
/* 166 */                                       if (i >= 2) {
/* 188 */                                           i2 = i7 + 2;
/* 190 */                                           i3 = this.I00ilI0I1;
                                                    break;
                                                }
/* 179 */                                       i = cArr[i7 + i] == "*/".charAt(i) ? i + 1 : 0;
                                            }
                                        } else {
                                            this.I00ilO0++;
/* 160 */                                   this.I00io1l = i6 + 1;
                                        }
                                        this.I00iio++;
                                    }
                                } else {
/* 107 */                           if (c2 != '/') {
                                        break;
                                    }
/* 112 */                           this.I00iio = i5 + 1;
/* 114 */                           I000l1();
/* 117 */                           i2 = this.I00iio;
/* 119 */                           i3 = this.I00ilI0I1;
                                }
                            } else {
/* 196 */                       if (c != '#') {
/* 212 */                           this.I00iio = i4;
/* 214 */                           return c;
                                }
/* 198 */                       this.I00iio = i4;
/* 200 */                       I000O01llI0();
/* 203 */                       I000l1();
/* 206 */                       i2 = this.I00iio;
/* 208 */                       i3 = this.I00ilI0I1;
                            }
                        }
/* 215 */               i2 = i4;
                    }
                }

                public final void I000O01llI0() throws o0IoiOl {
/* 4 */             if (this.I00iiI == 1) {
/* 6 */                 return;
                    }
/* 9 */             I001l0I00("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
/* 20 */            throw null;
                }

                public final void I000l1() {
                    char c;
/* 38 */            do {
/* 6 */                 if (this.I00iio >= this.I00ilI0I1 && !I0000Il00O(1)) {
/* 55 */                    return;
                        }
/* 14 */                char[] cArr = this.I00iiO;
/* 16 */                int i = this.I00iio;
/* 18 */                int i2 = i + 1;
/* 20 */                this.I00iio = i2;
/* 22 */                c = cArr[i];
/* 26 */                if (c == '\n') {
                            this.I00ilO0++;
/* 33 */                    this.I00io1l = i2;
/* 35 */                    return;
                        }
/* 38 */            } while (c != '\r');
                }

                public final String I00100l0(boolean z) {
/* 5 */             StringBuilder sb = new StringBuilder("$");
/* 8 */             int i = 0;
                    while (true) {
/* 9 */                 int i2 = this.I00lli11;
/* 11 */                if (i >= i2) {
/* 91 */                    return sb.toString();
                        }
/* 15 */                int i3 = this.I00ll1[i];
                        switch (i3) {
                            case 1:
                            case 2:
/* 63 */                        int i4 = this.I00o0iI0io1[i];
/* 65 */                        if (z && i4 > 0 && i == i2 - 1) {
                                    i4--;
                                }
/* 77 */                        sb.append('[');
/* 80 */                        sb.append(i4);
/* 85 */                        sb.append(']');
                                break;
                            case 3:
                            case 4:
                            case 5:
/* 48 */                        sb.append('.');
/* 53 */                        String str = this.I00lll10[i];
/* 55 */                        if (str == null) {
                                    break;
                                } else {
/* 57 */                            sb.append(str);
                                    break;
                                }
                            case 6:
                            case 7:
                            case 8:
                                break;
                            default:
/* 41 */                        I000II.I000O01llI0(Oi010OO0.I00100l0(i3, "Unknown scope value: ", new StringBuilder(String.valueOf(i3).length() + 21)));
/* 44 */                        return null;
                        }
/* 88 */                i++;
                    }
                }

                public final char I001i1lo1io() throws o0IoiOl {
                    int i;
/* 9 */             if (this.I00iio == this.I00ilI0I1 && !I0000Il00O(1)) {
/* 18 */                I001l0I00("Unterminated escape sequence");
/* 21 */                throw null;
                    }
/* 22 */            char[] cArr = this.I00iiO;
/* 24 */            int i2 = this.I00iio;
/* 26 */            int i3 = i2 + 1;
/* 28 */            this.I00iio = i3;
/* 30 */            char c = cArr[i2];
/* 35 */            if (c != '\n') {
/* 39 */                if (c != '\"') {
/* 43 */                    if (c != '\'') {
/* 47 */                        if (c != '/' && c != '\\') {
/* 55 */                            if (c == 'b') {
/* 182 */                               return '\b';
                                    }
/* 59 */                            if (c == 'f') {
/* 179 */                               return '\f';
                                    }
/* 63 */                            if (c == 'n') {
/* 33 */                                return '\n';
                                    }
/* 67 */                            if (c == 'r') {
/* 175 */                               return '\r';
                                    }
/* 71 */                            if (c == 't') {
/* 172 */                               return '\t';
                                    }
/* 75 */                            if (c != 'u') {
/* 168 */                               I001l0I00("Invalid escape sequence");
/* 171 */                               throw null;
                                    }
/* 82 */                            if (i2 + 5 > this.I00ilI0I1 && !I0000Il00O(4)) {
/* 91 */                                I001l0I00("Unterminated escape sequence");
/* 94 */                                throw null;
                                    }
/* 95 */                            int i4 = this.I00iio;
/* 97 */                            int i5 = i4 + 4;
/* 99 */                            int i6 = 0;
/* 100 */                           while (i4 < i5) {
/* 102 */                               int i7 = i6 << 4;
/* 104 */                               char c2 = cArr[i4];
/* 108 */                               if (c2 >= '0' && c2 <= '9') {
                                            i = c2 - '0';
                                        } else if (c2 >= 'a' && c2 <= 'f') {
                                            i = c2 - 'W';
                                        } else {
/* 130 */                                   if (c2 < 'A' || c2 > 'F') {
/* 155 */                                       I001l0I00("Malformed Unicode escape \\u".concat(new String(cArr, this.I00iio, 4)));
/* 158 */                                       throw null;
                                            }
                                            i = c2 - '7';
                                        }
/* 116 */                               i6 = i + i7;
/* 139 */                               i4++;
                                    }
                                    this.I00iio += 4;
/* 164 */                           return (char) i6;
                                }
                            }
                        }
/* 200 */               return c;
                    }
/* 187 */           if (this.I00iiI == 3) {
/* 209 */               I001l0I00("Cannot escape a newline character in strict mode");
/* 245 */               throw null;
                    }
                    this.I00ilO0++;
/* 194 */           this.I00io1l = i3;
/* 198 */           if (this.I00iiI == 3) {
/* 203 */               I001l0I00("Invalid escaped character \"'\" in strict mode");
/* 206 */               throw null;
                    }
/* 200 */           return c;
                }

                public final void I001l0I00(String str) throws o0IoiOl {
/* 3 */             String strI00oo1iO0ll = I00oo1iO0ll();
/* 77 */            throw new o0IoiOl(IIlIOloOOO.I0010I0i(new StringBuilder(str.length() + strI00oo1iO0ll.length() + 79), str, strI00oo1iO0ll, "\nSee https://github.com/google/gson/blob/main/Troubleshooting.md#malformed-json"));
                }

                public final IllegalStateException I00IOO(String str) {
/* 1 */             int iI00ooIo0 = I00ooIo0();
/* 11 */            String strI00000oIO = ll1OIi.I00000oIO(I00ooIo0());
/* 15 */            String strI00oo1iO0ll = I00oo1iO0ll();
/* 34 */            int length = strI00000oIO.length() + str.length() + 18 + strI00oo1iO0ll.length();
/* 50 */            String strConcat = "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(iI00ooIo0 == 9 ? "adapter-not-null-safe" : "unexpected-json-structure");
/* 59 */            StringBuilder sb = new StringBuilder(strConcat.length() + length + 5);
/* 66 */            IIl001iO0Io.I001lIiIIo1O(sb, "Expected ", str, " but was ", strI00000oIO);
/* 75 */            return new IllegalStateException(IIlIOloOOO.I0010I0i(sb, strI00oo1iO0ll, "\nSee ", strConcat));
                }

                public final void I00IioO0OiOi(String str) throws o0IoiOl {
/* 6 */             for (int i = 0; i < str.length(); i++) {
/* 14 */                if (str.charAt(i) > 127) {
/* 25 */                    I001l0I00("String contains non-ASCII characters: ".concat(str));
/* 29 */                    throw null;
                        }
                    }
                }

                public final void I00Io1lO() {
/* 1 */             int iI00iOIl = this.I00ioIO;
/* 3 */             if (iI00iOIl == 0) {
/* 5 */                 iI00iOIl = I00iOIl();
                    }
/* 10 */            if (iI00iOIl != 3) {
/* 55 */                throw I00IOO("BEGIN_ARRAY");
                    }
/* 13 */            I00000oIO(1);
/* 23 */            this.I00o0iI0io1[this.I00lli11 - 1] = 0;
/* 25 */            this.I00ioIO = 0;
                }

                public final void I00IoiI() {
/* 1 */             int iI00iOIl = this.I00ioIO;
/* 3 */             if (iI00iOIl == 0) {
/* 5 */                 iI00iOIl = I00iOIl();
                    }
/* 10 */            if (iI00iOIl != 4) {
/* 55 */                throw I00IOO("END_ARRAY");
                    }
/* 12 */            int i = this.I00lli11;
/* 16 */            this.I00lli11 = i - 1;
/* 18 */            int[] iArr = this.I00o0iI0io1;
                    int i2 = i - 2;
/* 26 */            iArr[i2] = iArr[i2] + 1;
/* 29 */            this.I00ioIO = 0;
                }

                public final void I00OIl() {
/* 1 */             int iI00iOIl = this.I00ioIO;
/* 3 */             if (iI00iOIl == 0) {
/* 5 */                 iI00iOIl = I00iOIl();
                    }
/* 10 */            if (iI00iOIl != 1) {
/* 55 */                throw I00IOO("BEGIN_OBJECT");
                    }
/* 13 */            I00000oIO(3);
/* 17 */            this.I00ioIO = 0;
                }

                public final void I00OOll1() {
/* 1 */             int iI00iOIl = this.I00ioIO;
/* 3 */             if (iI00iOIl == 0) {
/* 5 */                 iI00iOIl = I00iOIl();
                    }
/* 10 */            if (iI00iOIl != 2) {
/* 55 */                throw I00IOO("END_OBJECT");
                    }
/* 12 */            int i = this.I00lli11;
                    int i2 = i - 1;
/* 16 */            this.I00lli11 = i2;
/* 21 */            this.I00lll10[i2] = null;
/* 23 */            int[] iArr = this.I00o0iI0io1;
                    int i3 = i - 2;
/* 31 */            iArr[i3] = iArr[i3] + 1;
/* 34 */            this.I00ioIO = 0;
                }

                public final boolean I00Ol00() throws IOException {
/* 1 */             int iI00iOIl = this.I00ioIO;
/* 3 */             if (iI00iOIl == 0) {
/* 5 */                 iI00iOIl = I00iOIl();
                    }
                    return (iI00iOIl == 2 || iI00iOIl == 4 || iI00iOIl == 17) ? false : true;
                }

                /* JADX WARN: Code restructure failed: missing block: B:137:0x01cf, code lost:
                
                    r26 = r10;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:163:0x0225, code lost:
                
                    if (I00ooiO1I(r4) == false) goto L121;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:175:0x023f, code lost:
                
                    if (r6 == false) goto L179;
                 */
                /* JADX WARN: Removed duplicated region for block: B:112:0x0184  */
                /* JADX WARN: Removed duplicated region for block: B:125:0x01b7  */
                /* JADX WARN: Removed duplicated region for block: B:201:0x027c  */
                /* JADX WARN: Removed duplicated region for block: B:206:0x0289 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:207:0x028a  */
                /* JADX WARN: Removed duplicated region for block: B:213:0x02a2 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:243:0x02fd  */
                /* JADX WARN: Removed duplicated region for block: B:257:0x032b  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final int I00iOIl() throws IOException {
                    int i;
                    int i2;
                    int iI000II;
                    int iI000II2;
                    String str;
                    String str2;
                    int i3;
                    int i4;
                    char c;
                    char c2;
                    boolean z;
                    boolean z2;
                    int i5;
/* 3 */             char[] cArr = this.I00iiO;
/* 5 */             int[] iArr = this.I00ll1;
                    int i6 = this.I00lli11 - 1;
/* 11 */            int i7 = iArr[i6];
/* 24 */            int i8 = 3;
/* 34 */            boolean z3 = true;
/* 35 */            if (i7 != 1) {
/* 41 */                if (i7 == 2) {
/* 43 */                    int iI000II3 = I000II(true);
/* 47 */                    if (iI000II3 != 44) {
/* 49 */                        if (iI000II3 == 59) {
/* 62 */                            I000O01llI0();
                                } else {
/* 51 */                            if (iI000II3 != 93) {
/* 58 */                                I001l0I00("Unterminated array");
/* 61 */                                throw null;
                                    }
/* 53 */                            i8 = 4;
                                }
                            }
                        } else {
/* 69 */                    if (i7 == 3) {
/* 730 */                       i = 2;
/* 731 */                       i2 = 4;
                            } else if (i7 == 5) {
/* 73 */                        i2 = 4;
/* 75 */                        i = 2;
                            } else if (i7 == 4) {
/* 80 */                        iArr[i6] = 5;
/* 82 */                        int iI000II4 = I000II(true);
/* 88 */                        if (iI000II4 != 58) {
/* 92 */                            if (iI000II4 != 61) {
/* 124 */                               I001l0I00("Expected ':'");
/* 127 */                               throw null;
                                    }
/* 94 */                            I000O01llI0();
/* 101 */                           if (this.I00iio < this.I00ilI0I1 || I0000Il00O(1)) {
/* 109 */                               int i9 = this.I00iio;
/* 115 */                               if (cArr[i9] == '>') {
/* 118 */                                   this.I00iio = i9 + 1;
                                        }
                                    }
                                }
                            } else if (i7 == 6) {
/* 132 */                       if (this.I00iiI == 1) {
/* 134 */                           I000II(true);
/* 137 */                           int i10 = this.I00iio;
/* 141 */                           this.I00iio = i10 - 1;
/* 146 */                           if (i10 + 4 <= this.I00ilI0I1 || I0000Il00O(5)) {
/* 155 */                               int i11 = this.I00iio;
/* 161 */                               if (cArr[i11] == ')' && cArr[i11 + 1] == ']' && cArr[i11 + 2] == '}' && cArr[i11 + 3] == '\'' && cArr[i11 + 4] == '\n') {
/* 188 */                                   this.I00iio = i11 + 5;
                                        }
                                    }
                                }
/* 196 */                       this.I00ll1[this.I00lli11 - 1] = 7;
                            } else if (i7 == 7) {
/* 210 */                       if (I000II(false) == -1) {
/* 212 */                           i8 = 17;
                                } else {
/* 216 */                           I000O01llI0();
                                    this.I00iio--;
                                }
                            } else if (i7 == 8) {
/* 724 */                       I000II.I001IO000("JsonReader is closed");
/* 727 */                       return 0;
                            }
/* 733 */                   iArr[i6] = i2;
/* 735 */                   if (i7 != 5 || (iI000II2 = I000II(true)) == 44) {
/* 758 */                       iI000II = I000II(true);
/* 764 */                       if (iI000II != 34) {
/* 812 */                           i8 = 13;
                                } else {
/* 766 */                           if (iI000II == 39) {
/* 804 */                               I000O01llI0();
/* 809 */                               this.I00ioIO = 12;
/* 807 */                               return 12;
                                    }
/* 770 */                           if (iI000II != 125) {
/* 772 */                               I000O01llI0();
                                        this.I00iio--;
/* 788 */                               if (!I00ooiO1I((char) iI000II)) {
/* 793 */                                   I001l0I00("Expected name");
/* 796 */                                   throw null;
                                        }
/* 790 */                               i8 = 14;
                                    } else {
/* 797 */                               if (i7 == 5) {
/* 800 */                                   I001l0I00("Expected name");
/* 803 */                                   throw null;
                                        }
/* 747 */                               i8 = i;
                                    }
                                }
                            } else if (iI000II2 != 59) {
/* 745 */                       if (iI000II2 != 125) {
/* 751 */                           I001l0I00("Unterminated object");
/* 754 */                           throw null;
                                }
/* 747 */                       i8 = i;
                            } else {
/* 755 */                       I000O01llI0();
/* 758 */                       iI000II = I000II(true);
/* 764 */                       if (iI000II != 34) {
                                }
                            }
                        }
/* 814 */               this.I00ioIO = i8;
/* 2498 */              return i8;
                    }
/* 37 */            iArr[i6] = 2;
/* 229 */           int iI000II5 = I000II(true);
/* 235 */           if (iI000II5 != 34) {
/* 237 */               if (iI000II5 == 39) {
/* 711 */                   I000O01llI0();
/* 716 */                   this.I00ioIO = 8;
/* 714 */                   return 8;
                        }
/* 239 */               if (iI000II5 != 44 && iI000II5 != 59) {
/* 245 */                   if (iI000II5 != 91) {
/* 247 */                       if (iI000II5 != 93) {
/* 251 */                           if (iI000II5 != 123) {
                                        int i12 = this.I00iio - 1;
/* 259 */                               this.I00iio = i12;
/* 261 */                               char c3 = cArr[i12];
/* 265 */                               if (c3 == 't' || c3 == 'T') {
/* 304 */                                   str = "TRUE";
/* 306 */                                   str2 = "true";
/* 308 */                                   i3 = 5;
                                        } else if (c3 == 'f' || c3 == 'F') {
/* 298 */                                   str = "FALSE";
/* 300 */                                   str2 = "false";
/* 302 */                                   i3 = 6;
                                        } else {
/* 283 */                                   if (c3 == 'n' || c3 == 'N') {
/* 292 */                                       str = "NULL";
/* 294 */                                       str2 = "null";
/* 296 */                                       i3 = 7;
                                            }
/* 290 */                                   i4 = 0;
/* 387 */                                   if (i4 == 0) {
/* 675 */                                       return i4;
                                            }
/* 389 */                                   int i13 = this.I00iio;
/* 391 */                                   int i14 = this.I00ilI0I1;
/* 394 */                                   boolean z4 = true;
/* 396 */                                   int i15 = 0;
/* 397 */                                   char c4 = 0;
/* 398 */                                   boolean z5 = false;
/* 399 */                                   long j = 0;
                                            while (true) {
/* 405 */                                       if (i13 + i15 == i14) {
/* 409 */                                           if (i15 == 1024) {
                                                        break;
                                                    }
/* 420 */                                           if (!I0000Il00O(i15 + 1)) {
/* 422 */                                               z2 = z5;
                                                        break;
                                                    }
/* 427 */                                           i13 = this.I00iio;
/* 429 */                                           i14 = this.I00ilI0I1;
/* 434 */                                           c2 = cArr[i13 + i15];
/* 438 */                                           if (c2 != '+') {
                                                    }
/* 642 */                                           i15++;
                                                } else {
/* 434 */                                           c2 = cArr[i13 + i15];
/* 438 */                                           if (c2 != '+') {
/* 637 */                                               z = z5;
/* 639 */                                               if (c4 != 5) {
                                                            break;
                                                        }
/* 625 */                                               c4 = 6;
/* 515 */                                               z5 = z;
                                                    } else if (c2 == 'E' || c2 == 'e') {
/* 627 */                                               z = z5;
/* 630 */                                               if (c4 != 2 && c4 != 4) {
                                                            break;
                                                        }
/* 635 */                                               c4 = 5;
/* 515 */                                               z5 = z;
                                                    } else if (c2 == '-') {
/* 615 */                                               z = z5;
/* 618 */                                               if (c4 == 0) {
/* 620 */                                                   c4 = 1;
/* 621 */                                                   z5 = true;
                                                        } else {
/* 623 */                                                   if (c4 != 5) {
                                                                break;
                                                            }
/* 625 */                                                   c4 = 6;
/* 515 */                                                   z5 = z;
                                                        }
                                                    } else if (c2 == '.') {
/* 608 */                                               z = z5;
/* 611 */                                               if (c4 != 2) {
                                                            break;
                                                        }
/* 613 */                                               c4 = 3;
/* 515 */                                               z5 = z;
                                                    } else {
/* 458 */                                               if (c2 < '0' || c2 > '9') {
                                                            break;
                                                        }
/* 467 */                                               if (c4 == 1 || c4 == 0) {
/* 539 */                                                   j = -(c2 - '0');
/* 541 */                                                   z5 = z5;
/* 543 */                                                   c4 = 2;
                                                        } else {
/* 475 */                                                   if (c4 != 2) {
/* 519 */                                                       z = z5;
/* 521 */                                                       if (c4 == 3) {
/* 523 */                                                           z5 = z;
/* 525 */                                                           c4 = 4;
                                                                } else if (c4 == 5 || c4 == 6) {
/* 532 */                                                           z5 = z;
/* 534 */                                                           c4 = 7;
                                                                }
                                                            } else {
/* 479 */                                                       if (j == 0) {
                                                                    break;
                                                                }
/* 495 */                                                       z = z5;
/* 498 */                                                       long j2 = (10 * j) - (c2 - '0');
/* 511 */                                                       z4 &= j > -922337203685477580L || (j == -922337203685477580L && j2 < j);
/* 513 */                                                       j = j2;
                                                            }
/* 515 */                                                   z5 = z;
                                                        }
                                                    }
/* 642 */                                           i15++;
                                                }
/* 648 */                                       if (i5 == 0) {
/* 650 */                                           return i5;
                                                }
/* 659 */                                       if (!I00ooiO1I(cArr[this.I00iio])) {
/* 671 */                                           I001l0I00("Expected value");
/* 674 */                                           throw null;
                                                }
/* 661 */                                       I000O01llI0();
/* 666 */                                       this.I00ioIO = 10;
/* 664 */                                       return 10;
                                            }
/* 424 */                                   char c5 = 2;
/* 554 */                                   if (c4 != 2) {
/* 595 */                                       if (c4 != c5 || c4 == 4 || c4 == 7) {
/* 603 */                                           this.I00l0OO0IO = i15;
/* 605 */                                           i5 = 16;
/* 592 */                                           this.I00ioIO = i5;
                                                }
/* 411 */                                       i5 = 0;
                                            } else {
/* 556 */                                       if (z4) {
/* 562 */                                           if (j != Long.MIN_VALUE) {
/* 570 */                                               z3 = z2;
                                                    } else if (z2) {
                                                    }
/* 574 */                                           if (j != 0) {
/* 579 */                                               if (!z3) {
                                                        }
/* 583 */                                               this.I00l0I0l0lO1 = j;
                                                        this.I00iio += i15;
/* 590 */                                               i5 = 15;
/* 592 */                                               this.I00ioIO = i5;
                                                    }
/* 582 */                                           j = -j;
/* 583 */                                           this.I00l0I0l0lO1 = j;
                                                    this.I00iio += i15;
/* 590 */                                           i5 = 15;
/* 592 */                                           this.I00ioIO = i5;
                                                }
/* 567 */                                       c5 = 2;
/* 568 */                                       c4 = 2;
/* 595 */                                       if (c4 != c5) {
                                                }
/* 603 */                                       this.I00l0OO0IO = i15;
/* 605 */                                       i5 = 16;
/* 592 */                                       this.I00ioIO = i5;
                                            }
/* 648 */                                   if (i5 == 0) {
                                            }
                                        }
/* 309 */                               int i16 = this.I00iiI;
/* 311 */                               int i17 = 0;
                                        while (true) {
/* 312 */                                   int length = str2.length();
/* 316 */                                   int i18 = this.I00iio;
/* 318 */                                   int i19 = this.I00ilI0I1;
/* 320 */                                   if (i17 < length) {
/* 323 */                                       if ((i18 + i17 >= i19 && !I0000Il00O(i17 + 1)) || ((c = cArr[this.I00iio + i17]) != str2.charAt(i17) && (i16 == 3 || c != str.charAt(i17)))) {
                                                    break;
                                                }
/* 353 */                                       i17++;
                                            } else {
/* 357 */                                       if ((i18 + length < i19 || I0000Il00O(length + 1)) && I00ooiO1I(cArr[this.I00iio + length])) {
                                                    break;
                                                }
                                                this.I00iio += length;
/* 384 */                                       this.I00ioIO = i3;
/* 386 */                                       i4 = i3;
                                            }
                                        }
/* 290 */                               i4 = 0;
/* 387 */                               if (i4 == 0) {
                                        }
                                    } else {
/* 676 */                               i8 = 1;
                                    }
                                } else if (i7 == 1) {
/* 681 */                           i8 = 4;
                                }
                            }
                        }
/* 684 */               if (i7 != 1 && i7 != 2) {
/* 692 */                   I001l0I00("Unexpected value");
/* 695 */                   throw null;
                        }
/* 696 */               I000O01llI0();
                        this.I00iio--;
/* 708 */               this.I00ioIO = 7;
/* 707 */               return 7;
                    }
/* 719 */           i8 = 9;
/* 814 */           this.I00ioIO = i8;
/* 2498 */          return i8;
                }

                public final String I00iiI() throws IOException {
                    String strI00oooO;
/* 1 */             int iI00iOIl = this.I00ioIO;
/* 3 */             if (iI00iOIl == 0) {
/* 5 */                 iI00iOIl = I00iOIl();
                    }
/* 11 */            if (iI00iOIl == 14) {
/* 13 */                strI00oooO = I0100i();
                    } else if (iI00iOIl == 12) {
/* 24 */                strI00oooO = I00oooO('\'');
                    } else {
/* 31 */                if (iI00iOIl != 13) {
/* 110 */                   throw I00IOO("a name");
                        }
/* 35 */                strI00oooO = I00oooO('\"');
                    }
/* 40 */            this.I00ioIO = 0;
/* 48 */            this.I00lll10[this.I00lli11 - 1] = strI00oooO;
/* 50 */            return strI00oooO;
                }

                public final String I00ioIO() {
                    String string;
/* 1 */             int iI00iOIl = this.I00ioIO;
/* 3 */             if (iI00iOIl == 0) {
/* 5 */                 iI00iOIl = I00iOIl();
                    }
/* 11 */            if (iI00iOIl == 10) {
/* 13 */                string = I0100i();
                    } else if (iI00iOIl == 8) {
/* 24 */                string = I00oooO('\'');
                    } else if (iI00iOIl == 9) {
/* 35 */                string = I00oooO('\"');
                    } else if (iI00iOIl == 11) {
/* 44 */                string = this.I00li1OI;
/* 47 */                this.I00li1OI = null;
                    } else if (iI00iOIl == 15) {
/* 56 */                string = Long.toString(this.I00l0I0l0lO1);
                    } else {
/* 63 */                if (iI00iOIl != 16) {
/* 110 */                   throw I00IOO("a string");
                        }
/* 73 */                String str = new String(this.I00iiO, this.I00iio, this.I00l0OO0IO);
                        this.I00iio += this.I00l0OO0IO;
/* 83 */                string = str;
                    }
/* 85 */            this.I00ioIO = 0;
/* 87 */            int[] iArr = this.I00o0iI0io1;
                    int i = this.I00lli11 - 1;
/* 97 */            iArr[i] = iArr[i] + 1;
/* 99 */            return string;
                }

                public final boolean I00l0I0l0lO1() throws IOException {
/* 1 */             int iI00iOIl = this.I00ioIO;
/* 3 */             if (iI00iOIl == 0) {
/* 5 */                 iI00iOIl = I00iOIl();
                    }
/* 12 */            if (iI00iOIl == 5) {
/* 14 */                this.I00ioIO = 0;
/* 16 */                int[] iArr = this.I00o0iI0io1;
                        int i = this.I00lli11 - 1;
/* 25 */                iArr[i] = iArr[i] + 1;
/* 10 */                return true;
                    }
/* 29 */            if (iI00iOIl != 6) {
/* 55 */                throw I00IOO("a boolean");
                    }
/* 31 */            this.I00ioIO = 0;
/* 33 */            int[] iArr2 = this.I00o0iI0io1;
                    int i2 = this.I00lli11 - 1;
/* 42 */            iArr2[i2] = iArr2[i2] + 1;
/* 11 */            return false;
                }

                public final void I00lli11() {
/* 1 */             int iI00iOIl = this.I00ioIO;
/* 3 */             if (iI00iOIl == 0) {
/* 5 */                 iI00iOIl = I00iOIl();
                    }
/* 10 */            if (iI00iOIl != 7) {
/* 55 */                throw I00IOO("null");
                    }
/* 13 */            this.I00ioIO = 0;
/* 15 */            int[] iArr = this.I00o0iI0io1;
                    int i = this.I00lli11 - 1;
/* 25 */            iArr[i] = iArr[i] + 1;
                }

                public final double I00lll10() throws IOException, NumberFormatException {
/* 1 */             int iI00iOIl = this.I00ioIO;
/* 3 */             if (iI00iOIl == 0) {
/* 5 */                 iI00iOIl = I00iOIl();
                    }
/* 13 */            if (iI00iOIl == 15) {
/* 15 */                this.I00ioIO = 0;
/* 17 */                int[] iArr = this.I00o0iI0io1;
                        int i = this.I00lli11 - 1;
/* 26 */                iArr[i] = iArr[i] + 1;
/* 30 */                return this.I00l0I0l0lO1;
                    }
/* 36 */            if (iI00iOIl == 16) {
/* 38 */                char[] cArr = this.I00iiO;
/* 42 */                int i2 = this.I00iio;
/* 44 */                int i3 = this.I00l0OO0IO;
/* 49 */                this.I00li1OI = new String(cArr, i2, i3);
/* 52 */                this.I00iio = i2 + i3;
                    } else if (iI00iOIl == 8 || iI00iOIl == 9) {
/* 96 */                this.I00li1OI = I00oooO(iI00iOIl == 8 ? '\'' : '\"');
                    } else if (iI00iOIl == 10) {
/* 72 */                this.I00li1OI = I0100i();
                    } else if (iI00iOIl != 11) {
/* 84 */                throw I00IOO("a double");
                    }
/* 98 */            this.I00ioIO = 11;
                    try {
/* 102 */               double d = Double.parseDouble(this.I00li1OI);
/* 109 */               if (this.I00iiI != 1 && (Double.isNaN(d) || Double.isInfinite(d))) {
/* 136 */                   StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 33);
/* 141 */                   sb.append("JSON forbids NaN and infinities: ");
/* 144 */                   sb.append(d);
/* 151 */                   I001l0I00(sb.toString());
/* 154 */                   throw null;
                        }
/* 155 */               this.I00li1OI = null;
/* 157 */               this.I00ioIO = 0;
/* 159 */               int[] iArr2 = this.I00o0iI0io1;
                        int i4 = this.I00lli11 - 1;
/* 168 */               iArr2[i4] = iArr2[i4] + 1;
/* 170 */               return d;
                    } catch (NumberFormatException e) {
/* 174 */               String str = this.I00li1OI;
/* 176 */               String strI00oo1iO0ll = I00oo1iO0ll();
/* 206 */               NumberFormatException numberFormatException = new NumberFormatException(IIlIOloOOO.I0010I0i(new StringBuilder(String.valueOf(str).length() + 26 + strI00oo1iO0ll.length()), "Expected a double but was ", str, strI00oo1iO0ll));
/* 209 */               numberFormatException.initCause(e);
/* 245 */               throw numberFormatException;
                    }
                }

                public final long I00o0iI0io1() throws IOException, NumberFormatException {
                    String strI00oooO;
/* 3 */             int iI00iOIl = this.I00ioIO;
/* 5 */             if (iI00iOIl == 0) {
/* 7 */                 iI00iOIl = I00iOIl();
                    }
/* 14 */            if (iI00iOIl == 15) {
/* 16 */                this.I00ioIO = 0;
/* 18 */                int[] iArr = this.I00o0iI0io1;
                        int i = this.I00lli11 - 1;
/* 28 */                iArr[i] = iArr[i] + 1;
/* 30 */                return this.I00l0I0l0lO1;
                    }
/* 35 */            if (iI00iOIl == 16) {
/* 37 */                char[] cArr = this.I00iiO;
/* 41 */                int i2 = this.I00iio;
/* 43 */                int i3 = this.I00l0OO0IO;
/* 48 */                this.I00li1OI = new String(cArr, i2, i3);
/* 51 */                this.I00iio = i2 + i3;
                    } else {
/* 58 */                if (iI00iOIl != 8 && iI00iOIl != 9 && iI00iOIl != 10) {
/* 73 */                    throw I00IOO("a long");
                        }
/* 74 */                if (iI00iOIl == 10) {
/* 76 */                    strI00oooO = I0100i();
/* 80 */                    this.I00li1OI = strI00oooO;
                        } else {
/* 90 */                    strI00oooO = I00oooO(iI00iOIl == 8 ? '\'' : '\"');
/* 94 */                    this.I00li1OI = strI00oooO;
                        }
/* 96 */                I00IioO0OiOi(strI00oooO);
                        try {
/* 101 */                   long j = Long.parseLong(this.I00li1OI);
/* 105 */                   this.I00ioIO = 0;
/* 107 */                   int[] iArr2 = this.I00o0iI0io1;
                            int i4 = this.I00lli11 - 1;
/* 117 */                   iArr2[i4] = iArr2[i4] + 1;
/* 119 */                   return j;
                        } catch (NumberFormatException unused) {
                        }
                    }
/* 122 */           this.I00ioIO = 11;
                    try {
/* 126 */               double d = Double.parseDouble(this.I00li1OI);
/* 130 */               long j2 = (long) d;
/* 134 */               if (j2 != d) {
/* 156 */                   String str = this.I00li1OI;
/* 158 */                   String strI00oo1iO0ll = I00oo1iO0ll();
/* 189 */                   throw new NumberFormatException(IIlIOloOOO.I0010I0i(new StringBuilder(String.valueOf(str).length() + 24 + strI00oo1iO0ll.length()), "Expected a long but was ", str, strI00oo1iO0ll));
                        }
/* 137 */               this.I00li1OI = null;
/* 139 */               this.I00ioIO = 0;
/* 141 */               int[] iArr3 = this.I00o0iI0io1;
                        int i5 = this.I00lli11 - 1;
/* 151 */               iArr3[i5] = iArr3[i5] + 1;
/* 153 */               return j2;
                    } catch (NumberFormatException e) {
/* 193 */               String str2 = this.I00li1OI;
/* 195 */               String strI00oo1iO0ll2 = I00oo1iO0ll();
/* 223 */               NumberFormatException numberFormatException = new NumberFormatException(IIlIOloOOO.I0010I0i(new StringBuilder(String.valueOf(str2).length() + 24 + strI00oo1iO0ll2.length()), "Expected a long but was ", str2, strI00oo1iO0ll2));
/* 226 */               numberFormatException.initCause(e);
/* 245 */               throw numberFormatException;
                    }
                }

                public final int I00oII() {
                    String strI00oooO;
/* 1 */             int iI00iOIl = this.I00ioIO;
/* 3 */             if (iI00iOIl == 0) {
/* 5 */                 iI00iOIl = I00iOIl();
                    }
/* 14 */            if (iI00iOIl == 15) {
/* 16 */                long j = this.I00l0I0l0lO1;
/* 18 */                int i = (int) j;
/* 22 */                if (j == i) {
/* 24 */                    this.I00ioIO = 0;
/* 26 */                    int[] iArr = this.I00o0iI0io1;
                            int i2 = this.I00lli11 - 1;
/* 36 */                    iArr[i2] = iArr[i2] + 1;
/* 38 */                    return i;
                        }
/* 41 */                String strI00oo1iO0ll = I00oo1iO0ll();
/* 62 */                StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 24 + strI00oo1iO0ll.length());
/* 65 */                sb.append("Expected an int but was ");
/* 68 */                sb.append(j);
/* 71 */                sb.append(strI00oo1iO0ll);
/* 81 */                throw new NumberFormatException(sb.toString());
                    }
/* 84 */            if (iI00iOIl == 16) {
/* 86 */                char[] cArr = this.I00iiO;
/* 90 */                int i3 = this.I00iio;
/* 92 */                int i4 = this.I00l0OO0IO;
/* 97 */                this.I00li1OI = new String(cArr, i3, i4);
/* 100 */               this.I00iio = i3 + i4;
                    } else {
/* 107 */               if (iI00iOIl != 8 && iI00iOIl != 9 && iI00iOIl != 10) {
/* 122 */                   throw I00IOO("an int");
                        }
/* 123 */               if (iI00iOIl == 10) {
/* 125 */                   strI00oooO = I0100i();
/* 129 */                   this.I00li1OI = strI00oooO;
                        } else {
/* 139 */                   strI00oooO = I00oooO(iI00iOIl == 8 ? '\'' : '\"');
/* 143 */                   this.I00li1OI = strI00oooO;
                        }
/* 145 */               I00IioO0OiOi(strI00oooO);
                        try {
/* 150 */                   int i5 = Integer.parseInt(this.I00li1OI);
/* 154 */                   this.I00ioIO = 0;
/* 156 */                   int[] iArr2 = this.I00o0iI0io1;
                            int i6 = this.I00lli11 - 1;
/* 166 */                   iArr2[i6] = iArr2[i6] + 1;
/* 168 */                   return i5;
                        } catch (NumberFormatException unused) {
                        }
                    }
/* 171 */           this.I00ioIO = 11;
                    try {
/* 175 */               double d = Double.parseDouble(this.I00li1OI);
/* 179 */               int i7 = (int) d;
/* 183 */               if (i7 != d) {
/* 205 */                   String str = this.I00li1OI;
/* 207 */                   String strI00oo1iO0ll2 = I00oo1iO0ll();
/* 238 */                   throw new NumberFormatException(IIlIOloOOO.I0010I0i(new StringBuilder(String.valueOf(str).length() + 24 + strI00oo1iO0ll2.length()), "Expected an int but was ", str, strI00oo1iO0ll2));
                        }
/* 186 */               this.I00li1OI = null;
/* 188 */               this.I00ioIO = 0;
/* 190 */               int[] iArr3 = this.I00o0iI0io1;
                        int i8 = this.I00lli11 - 1;
/* 200 */               iArr3[i8] = iArr3[i8] + 1;
/* 202 */               return i7;
                    } catch (NumberFormatException e) {
/* 242 */               String str2 = this.I00li1OI;
/* 244 */               String strI00oo1iO0ll3 = I00oo1iO0ll();
/* 272 */               NumberFormatException numberFormatException = new NumberFormatException(IIlIOloOOO.I0010I0i(new StringBuilder(String.valueOf(str2).length() + 24 + strI00oo1iO0ll3.length()), "Expected an int but was ", str2, strI00oo1iO0ll3));
/* 275 */               numberFormatException.initCause(e);
/* 743 */               throw numberFormatException;
                    }
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                public final void I00oliIiO01i() {
/* 2 */             int i = 0;
/* 128 */           do {
/* 3 */                 int iI00iOIl = this.I00ioIO;
/* 5 */                 if (iI00iOIl == 0) {
/* 7 */                     iI00iOIl = I00iOIl();
                        }
                        switch (iI00iOIl) {
                            case 1:
/* 122 */                       I00000oIO(3);
/* 99 */                        i++;
/* 126 */                       this.I00ioIO = 0;
                                break;
                            case 2:
/* 102 */                       if (i == 0) {
/* 111 */                           this.I00lll10[this.I00lli11 - 1] = null;
/* 113 */                           i = 0;
                                }
                                this.I00lli11--;
                                i--;
/* 126 */                       this.I00ioIO = 0;
                                break;
                            case 3:
/* 96 */                        I00000oIO(1);
/* 99 */                        i++;
/* 126 */                       this.I00ioIO = 0;
                                break;
                            case 4:
                                this.I00lli11--;
                                i--;
/* 126 */                       this.I00ioIO = 0;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 11:
                            case 15:
                            default:
/* 126 */                       this.I00ioIO = 0;
                                break;
                            case 8:
/* 83 */                        I0100o111I('\'');
/* 126 */                       this.I00ioIO = 0;
                                break;
                            case 9:
/* 79 */                        I0100o111I('\"');
/* 126 */                       this.I00ioIO = 0;
                                break;
                            case 10:
/* 75 */                        I010101Oo1lO();
/* 126 */                       this.I00ioIO = 0;
                                break;
                            case 12:
/* 61 */                        I0100o111I('\'');
/* 64 */                        if (i == 0) {
/* 72 */                            this.I00lll10[this.I00lli11 - 1] = "<skipped>";
/* 45 */                            i = 0;
                                }
/* 126 */                       this.I00ioIO = 0;
                                break;
                            case 13:
/* 47 */                        I0100o111I('\"');
/* 50 */                        if (i == 0) {
/* 58 */                            this.I00lll10[this.I00lli11 - 1] = "<skipped>";
/* 45 */                            i = 0;
                                }
/* 126 */                       this.I00ioIO = 0;
                                break;
                            case 14:
/* 32 */                        I010101Oo1lO();
/* 35 */                        if (i == 0) {
/* 43 */                            this.I00lll10[this.I00lli11 - 1] = "<skipped>";
/* 45 */                            i = 0;
                                }
/* 126 */                       this.I00ioIO = 0;
                                break;
                            case 16:
                                this.I00iio += this.I00l0OO0IO;
/* 126 */                       this.I00ioIO = 0;
                                break;
                            case 17:
                                break;
                        }
/* 23 */                return;
/* 128 */           } while (i > 0);
/* 130 */           int[] iArr = this.I00o0iI0io1;
                    int i2 = this.I00lli11 - 1;
/* 139 */           iArr[i2] = iArr[i2] + 1;
                }

                public final String I00oo1iO0ll() {
/* 3 */             int i = this.I00ilO0 + 1;
/* 9 */             int i2 = this.I00iio - this.I00io1l;
/* 11 */            String strI00100l0 = I00100l0(false);
/* 19 */            int length = String.valueOf(i).length();
/* 23 */            int i3 = i2 + 1;
/* 45 */            StringBuilder sb = new StringBuilder(length + 17 + String.valueOf(i3).length() + 6 + strI00100l0.length());
/* 52 */            IIlIOloOOO.I001l0I00(sb, " at line ", i, " column ", i3);
/* 57 */            return IIl001iO0Io.I00100l0(sb, " path ", strI00100l0);
                }

                public final int I00ooIo0() {
/* 1 */             int iI00iOIl = this.I00ioIO;
/* 3 */             if (iI00iOIl == 0) {
/* 5 */                 iI00iOIl = I00iOIl();
                    }
                    switch (iI00iOIl) {
                        case 1:
/* 33 */                    return 3;
                        case 2:
/* 31 */                    return 4;
                        case 3:
/* 29 */                    return 1;
                        case 4:
/* 27 */                    return 2;
                        case 5:
                        case 6:
/* 24 */                    return 8;
                        case 7:
/* 21 */                    return 9;
                        case 8:
                        case 9:
                        case 10:
                        case 11:
/* 19 */                    return 6;
                        case 12:
                        case 13:
                        case 14:
/* 17 */                    return 5;
                        case 15:
                        case 16:
/* 15 */                    return 7;
                        default:
/* 12 */                    return 10;
                    }
                }

                public final boolean I00ooiO1I(char c) throws o0IoiOl {
/* 3 */             if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
/* 61 */                return false;
                    }
/* 23 */            if (c != '#') {
/* 27 */                if (c == ',') {
/* 61 */                    return false;
                        }
/* 31 */                if (c != '/' && c != '=') {
/* 39 */                    if (c == '{' || c == '}' || c == ':') {
/* 61 */                        return false;
                            }
/* 51 */                    if (c != ';') {
                                switch (c) {
                                    case '[':
                                    case ']':
/* 61 */                                return false;
                                    case '\\':
                                        break;
                                    default:
/* 56 */                                return true;
                                }
                            }
                        }
                    }
/* 58 */            I000O01llI0();
/* 61 */            return false;
                }

                /* JADX WARN: Code restructure failed: missing block: B:30:0x006e, code lost:
                
                    r4 = r2 - r3;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:31:0x0070, code lost:
                
                    if (r1 != null) goto L33;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:32:0x0072, code lost:
                
                    r1 = new java.lang.StringBuilder(java.lang.Math.max(r4 + r4, 16));
                 */
                /* JADX WARN: Code restructure failed: missing block: B:33:0x007e, code lost:
                
                    r1.append(r5, r3, r4);
                    r11.I00iio = r2;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final String I00oooO(char c) throws o0IoiOl {
/* 2 */             StringBuilder sb = null;
/* 136 */           do {
/* 3 */                 int i = this.I00iio;
/* 5 */                 int i2 = this.I00ilI0I1;
/* 8 */                 int i3 = i;
                        while (true) {
/* 9 */                     char[] cArr = this.I00iiO;
/* 14 */                    if (i >= i2) {
                                break;
                            }
/* 16 */                    int i4 = i + 1;
/* 18 */                    char c2 = cArr[i];
/* 23 */                    if (this.I00iiI == 3 && c2 < ' ') {
/* 32 */                        I001l0I00("Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode");
/* 35 */                        throw null;
                            }
/* 36 */                    if (c2 == c) {
                                int i5 = (i4 - i3) - 1;
/* 42 */                        this.I00iio = i4;
/* 44 */                        if (sb == null) {
/* 48 */                            return new String(cArr, i3, i5);
                                }
/* 52 */                        sb.append(cArr, i3, i5);
/* 55 */                        return sb.toString();
                            }
/* 62 */                    if (c2 == '\\') {
/* 64 */                        int i6 = i4 - i3;
                                int i7 = i6 - 1;
/* 68 */                        this.I00iio = i4;
/* 70 */                        if (sb == null) {
/* 79 */                            sb = new StringBuilder(Math.max(i6 + i6, 16));
                                }
/* 82 */                        sb.append(cArr, i3, i7);
/* 89 */                        sb.append(I001i1lo1io());
/* 92 */                        i3 = this.I00iio;
/* 94 */                        i2 = this.I00ilI0I1;
/* 96 */                        i = i3;
                            } else {
/* 100 */                       if (c2 == '\n') {
                                    this.I00ilO0++;
/* 107 */                           this.I00io1l = i4;
                                }
/* 109 */                       i = i4;
                            }
                        }
/* 136 */           } while (I0000Il00O(1));
/* 142 */           I001l0I00("Unterminated string");
/* 168 */           throw null;
                }

                /* JADX WARN: Code restructure failed: missing block: B:34:0x0048, code lost:
                
                    I000O01llI0();
                 */
                /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0042. Please report as an issue. */
                /* JADX WARN: Removed duplicated region for block: B:46:0x007b  */
                /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final String I0100i() throws o0IoiOl {
                    String string;
/* 1 */             char[] cArr = this.I00iiO;
/* 3 */             int i = 0;
/* 4 */             StringBuilder sb = null;
/* 120 */           do {
/* 5 */                 int i2 = 0;
                        while (true) {
/* 8 */                     int i3 = this.I00iio + i2;
/* 11 */                    if (i3 < this.I00ilI0I1) {
/* 13 */                        char c = cArr[i3];
/* 17 */                        if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
/* 37 */                            if (c != '#') {
/* 41 */                                if (c != ',') {
/* 45 */                                    if (c != '/' && c != '=') {
/* 53 */                                        if (c != '{' && c != '}' && c != ':') {
/* 65 */                                            if (c != ';') {
                                                        switch (c) {
                                                            case '[':
                                                            case ']':
                                                                break;
                                                            case '\\':
                                                                break;
                                                            default:
/* 70 */                                                        i2++;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (i2 >= 1024) {
/* 92 */                        if (sb == null) {
/* 102 */                           sb = new StringBuilder(Math.max(i2, 16));
                                }
/* 107 */                       sb.append(cArr, this.I00iio, i2);
                                this.I00iio += i2;
                            } else if (I0000Il00O(i2 + 1)) {
                            }
                        }
/* 90 */                i = i2;
/* 122 */               if (sb != null) {
/* 128 */                   string = new String(cArr, this.I00iio, i);
                        } else {
/* 134 */                   sb.append(cArr, this.I00iio, i);
/* 137 */                   string = sb.toString();
                        }
                        this.I00iio += i;
/* 146 */               return string;
/* 120 */           } while (I0000Il00O(1));
/* 122 */           if (sb != null) {
                    }
                    this.I00iio += i;
/* 146 */           return string;
                }

                public final void I0100o111I(char c) throws o0IoiOl {
/* 52 */            do {
/* 1 */                 int i = this.I00iio;
/* 3 */                 int i2 = this.I00ilI0I1;
/* 6 */                 while (i < i2) {
/* 10 */                    int i3 = i + 1;
/* 12 */                    char c2 = this.I00iiO[i];
/* 14 */                    if (c2 == c) {
/* 16 */                        this.I00iio = i3;
/* 18 */                        return;
                            }
/* 21 */                    if (c2 == '\\') {
/* 23 */                        this.I00iio = i3;
/* 25 */                        I001i1lo1io();
/* 28 */                        i = this.I00iio;
/* 30 */                        i2 = this.I00ilI0I1;
                            } else {
/* 35 */                        if (c2 == '\n') {
                                    this.I00ilO0++;
/* 42 */                            this.I00io1l = i3;
                                }
/* 44 */                        i = i3;
                            }
                        }
/* 46 */                this.I00iio = i;
/* 52 */            } while (I0000Il00O(1));
/* 57 */            I001l0I00("Unterminated string");
/* 77 */            throw null;
                }

                /* JADX WARN: Code restructure failed: missing block: B:34:0x0047, code lost:
                
                    I000O01llI0();
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I010101Oo1lO() throws o0IoiOl {
/* 88 */            do {
/* 2 */                 int i = 0;
                        while (true) {
/* 5 */                     int i2 = this.I00iio + i;
/* 8 */                     if (i2 < this.I00ilI0I1) {
/* 12 */                        char c = this.I00iiO[i2];
/* 16 */                        if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
/* 36 */                            if (c != '#') {
/* 40 */                                if (c != ',') {
/* 44 */                                    if (c != '/' && c != '=') {
/* 52 */                                        if (c != '{' && c != '}' && c != ':') {
/* 64 */                                            if (c != ';') {
                                                        switch (c) {
                                                            case '[':
                                                            case ']':
                                                                break;
                                                            case '\\':
                                                                break;
                                                            default:
/* 69 */                                                        i++;
                                                        }
/* 80 */                                                return;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
/* 81 */                        this.I00iio = i2;
                            }
                        }
                        this.I00iio += i;
/* 80 */                return;
/* 88 */            } while (I0000Il00O(1));
                }

                @Override
                public final void close() throws IOException {
/* 2 */             this.I00ioIO = 0;
/* 8 */             this.I00ll1[0] = 8;
/* 11 */            this.I00lli11 = 1;
/* 15 */            this.I00iOIl.close();
                }

                public final String toString() {
/* 11 */            return o0IlOioo.class.getSimpleName().concat(I00oo1iO0ll());
                }
            }
