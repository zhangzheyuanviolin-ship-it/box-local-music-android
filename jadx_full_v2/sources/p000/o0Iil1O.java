            package p000;

            import java.util.Iterator;
            
            public final class o0Iil1O implements Iterator {
                public String I00iOIl;
                public final CharSequence I00iiO;
                public final ll0IioI0 I00iio;
                public final boolean I00ilI0I1;
                public final int I00ioIO;
                public final i1olliOl I00l0I0l0lO1;
                public int I00iiI = 2;
                public int I00ilO0 = 0;
                public int I00io1l = Integer.MAX_VALUE;

                public o0Iil1O(i1olliOl i1olliol, I0oO0iO1l0lo i0oO0iO1l0lo, CharSequence charSequence, int i) {
/* 1 */             this.I00ioIO = i;
/* 3 */             this.I00l0I0l0lO1 = i1olliol;
/* 18 */            this.I00iio = (ll0IioI0) i0oO0iO1l0lo.I00iiO;
/* 22 */            this.I00ilI0I1 = i0oO0iO1l0lo.I00iiI;
/* 29 */            this.I00iiO = charSequence;
                }

                /* JADX WARN: Code restructure failed: missing block: B:74:0x0128, code lost:
                
                    throw new java.lang.IndexOutOfBoundsException(r0);
                 */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean hasNext() {
                    int length;
                    boolean z;
                    CharSequence charSequence;
                    String strI00000oIO;
                    int length2;
                    ll0IioI0 ll0iioi0;
/* 3 */             int i = this.I00iiI;
/* 6 */             if (i == 4) {
/* 318 */               IOOlIIilOl0.I000iOII();
/* 316 */               return false;
                    }
                    int i2 = i - 1;
/* 10 */            String string = null;
/* 11 */            if (i == 0) {
/* 315 */               throw null;
                    }
/* 14 */            if (i2 == 0) {
/* 13 */                return true;
                    }
/* 17 */            if (i2 == 2) {
/* 311 */               return false;
                    }
/* 19 */            this.I00iiI = 4;
/* 21 */            int i3 = this.I00ilO0;
                    while (true) {
/* 23 */                length = this.I00ilO0;
/* 27 */                if (length != -1) {
/* 29 */                    int i4 = this.I00ioIO;
/* 31 */                    i1olliOl i1olliol = this.I00l0I0l0lO1;
/* 33 */                    charSequence = this.I00iiO;
                            switch (i4) {
                                case 0:
/* 82 */                            z = false;
/* 84 */                            int length3 = charSequence.length();
/* 88 */                            if (length < 0 || length > length3) {
/* 122 */                               if (length >= 0) {
/* 124 */                                   if (length3 < 0) {
/* 132 */                                       I000II.I000iOII(Oi010OO0.I000oI1ioi(length3, "negative size: "));
/* 135 */                                       length = 0;
                                                break;
                                            } else {
/* 275 */                                       strI00000oIO = liiIiI1.I00000oIO("%s (%s) must not be greater than size (%s)", "index", Integer.valueOf(length), Integer.valueOf(length3));
                                                break;
                                            }
                                        } else {
/* 290 */                                   strI00000oIO = liiIiI1.I00000oIO("%s (%s) must not be negative", "index", Integer.valueOf(length));
                                            break;
                                        }
                                    } else {
                                        while (true) {
/* 93 */                                    if (length >= length3) {
/* 116 */                                       length = -1;
                                                break;
                                            } else {
/* 110 */                                       if (((lIOlll) ((i1Il01) i1olliol).I00iiI).I00000oIO(charSequence.charAt(length))) {
                                                    break;
                                                } else {
/* 113 */                                           length++;
                                                }
                                            }
                                        }
                                    }
                                default:
/* 38 */                            int length4 = charSequence.length();
/* 45 */                            String str = ((I0i0io0oOOi) i1olliol).I00iiI;
/* 47 */                            int length5 = str.length();
/* 51 */                            int i5 = length4 - length5;
                                    while (true) {
/* 52 */                                if (length <= i5) {
/* 55 */                                    for (int i6 = 0; i6 < length5; i6++) {
/* 69 */                                        if (charSequence.charAt(i6 + length) != str.charAt(i6)) {
                                                    break;
                                                }
                                            }
                                        } else {
/* 80 */                                    length = -1;
                                        }
/* 71 */                                length++;
                                    }
/* 77 */                            z = false;
                                    break;
                            }
/* 137 */                   if (length == -1) {
/* 139 */                       length = charSequence.length();
/* 143 */                       this.I00ilO0 = -1;
/* 145 */                       length2 = -1;
                            } else {
                                switch (i4) {
                                    case 0:
/* 160 */                               length2 = length + 1;
                                        break;
                                    default:
/* 158 */                               length2 = ((I0i0io0oOOi) i1olliol).I00iiI.length() + length;
                                        break;
                                }
/* 162 */                       this.I00ilO0 = length2;
                            }
/* 164 */                   if (length2 == i3) {
/* 166 */                       int i7 = length2 + 1;
/* 168 */                       this.I00ilO0 = i7;
/* 174 */                       if (i7 > charSequence.length()) {
/* 176 */                           this.I00ilO0 = -1;
                                }
                            } else {
                                while (true) {
/* 180 */                           ll0iioi0 = this.I00iio;
/* 182 */                           if (i3 < length && ll0iioi0.I00000oIO(charSequence.charAt(i3))) {
/* 194 */                               i3++;
                                    }
                                }
/* 197 */                       while (length > i3) {
                                    int i8 = length - 1;
/* 209 */                           if (ll0iioi0.I00000oIO(charSequence.charAt(i8))) {
/* 211 */                               length = i8;
                                    } else if (!this.I00ilI0I1 && i3 == length) {
/* 219 */                               i3 = this.I00ilO0;
                                    }
                                }
/* 215 */                       if (!this.I00ilI0I1) {
                                }
                            }
                        } else {
/* 298 */                   z = false;
/* 300 */                   this.I00iiI = 3;
                        }
                    }
/* 223 */           int i9 = this.I00io1l;
/* 225 */           if (i9 == 1) {
/* 227 */               length = charSequence.length();
/* 231 */               this.I00ilO0 = -1;
/* 233 */               while (length > i3) {
                            int i10 = length - 1;
/* 245 */                   if (ll0iioi0.I00000oIO(charSequence.charAt(i10))) {
/* 247 */                       length = i10;
                            }
                        }
                    } else {
/* 250 */               this.I00io1l = i9 - 1;
                    }
/* 256 */           string = charSequence.subSequence(i3, length).toString();
/* 302 */           this.I00iOIl = string;
/* 306 */           if (this.I00iiI == 3) {
/* 313 */               return z;
                    }
/* 308 */           this.I00iiI = 1;
/* 13 */            return true;
                }

                @Override
                public final Object next() {
/* 5 */             if (!hasNext()) {
/* 16 */                IoOOl0iOl1io.I00000oOI();
/* 19 */                return null;
                    }
/* 8 */             this.I00iiI = 2;
/* 10 */            String str = this.I00iOIl;
/* 13 */            this.I00iOIl = null;
/* 15 */            return str;
                }

                @Override
                public final void remove() {
/* 20 */            throw new UnsupportedOperationException();
                }
            }
