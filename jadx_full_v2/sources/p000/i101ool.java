            package p000;

            import java.util.Iterator;
            
            public final class i101ool implements Iterator {
                public final int I00iOIl;
                public String I00iiI;
                public int I00iiO;
                public CharSequence I00iio;
                public int I00ilI0I1;
                public int I00ilO0;

                @Override
                public final boolean hasNext() {
                    int i;
                    int i2;
/* 10 */            String string = null;
                    switch (this.I00iOIl) {
                        case 0:
/* 156 */                   int i3 = this.I00iiO;
/* 158 */                   if (i3 != 4) {
                                int i4 = i3 - 1;
/* 162 */                       if (i3 == 0) {
/* 291 */                           throw null;
                                }
/* 164 */                       if (i4 == 0) {
/* 7 */                             return true;
                                }
/* 166 */                       if (i4 != 2) {
/* 168 */                           this.I00iiO = 4;
/* 170 */                           CharSequence charSequence = this.I00iio;
/* 172 */                           int i5 = this.I00ilI0I1;
                                    while (true) {
/* 174 */                               int length = this.I00ilI0I1;
/* 176 */                               if (length != -1) {
/* 182 */                                   int length2 = charSequence.length() - 4;
                                            while (true) {
/* 183 */                                       if (length <= length2) {
/* 186 */                                           for (int i6 = 0; i6 < 4; i6++) {
/* 198 */                                               if (charSequence.charAt(i6 + length) != "#vk ".charAt(i6)) {
                                                            break;
                                                        }
                                                    }
                                                } else {
/* 206 */                                           length = -1;
                                                }
/* 200 */                                       length++;
                                            }
/* 207 */                                   if (length == -1) {
/* 209 */                                       length = charSequence.length();
/* 213 */                                       this.I00ilI0I1 = -1;
/* 215 */                                       i = -1;
                                            } else {
/* 217 */                                       i = length + 4;
/* 219 */                                       this.I00ilI0I1 = i;
                                            }
/* 221 */                                   if (i == i5) {
/* 223 */                                       int i7 = i + 1;
/* 225 */                                       this.I00ilI0I1 = i7;
/* 231 */                                       if (i7 > charSequence.length()) {
/* 233 */                                           this.I00ilI0I1 = -1;
                                                }
                                            } else {
/* 236 */                                       if (i5 < length) {
/* 238 */                                           charSequence.charAt(i5);
                                                }
/* 241 */                                       if (i5 < length) {
/* 245 */                                           charSequence.charAt(length - 1);
                                                }
/* 248 */                                       int i8 = this.I00ilO0;
/* 250 */                                       if (i8 == 1) {
/* 252 */                                           length = charSequence.length();
/* 256 */                                           this.I00ilI0I1 = -1;
/* 258 */                                           if (length > i5) {
/* 262 */                                               charSequence.charAt(length - 1);
                                                    }
                                                } else {
/* 267 */                                           this.I00ilO0 = i8 - 1;
                                                }
/* 273 */                                       string = charSequence.subSequence(i5, length).toString();
                                            }
                                        } else {
/* 278 */                                   this.I00iiO = 3;
                                        }
                                    }
/* 280 */                           this.I00iiI = string;
/* 284 */                           if (this.I00iiO != 3) {
/* 286 */                               this.I00iiO = 1;
/* 7 */                                 return true;
                                    }
                                }
                            } else {
/* 292 */                       IOOlIIilOl0.I000iOII();
                            }
/* 11 */                    return false;
                        default:
/* 15 */                    int i9 = this.I00iiO;
/* 17 */                    if (i9 != 4) {
                                int i10 = i9 - 1;
/* 21 */                        if (i9 == 0) {
/* 150 */                           throw null;
                                }
/* 23 */                        if (i10 == 0) {
/* 7 */                             return true;
                                }
/* 25 */                        if (i10 != 2) {
/* 27 */                            this.I00iiO = 4;
/* 29 */                            CharSequence charSequence2 = this.I00iio;
/* 31 */                            int i11 = this.I00ilI0I1;
                                    while (true) {
/* 33 */                                int length3 = this.I00ilI0I1;
/* 35 */                                if (length3 != -1) {
/* 41 */                                    int length4 = charSequence2.length() - 4;
                                            while (true) {
/* 42 */                                        if (length3 <= length4) {
/* 45 */                                            for (int i12 = 0; i12 < 4; i12++) {
/* 57 */                                                if (charSequence2.charAt(i12 + length3) != "#vk ".charAt(i12)) {
                                                            break;
                                                        }
                                                    }
                                                } else {
/* 65 */                                            length3 = -1;
                                                }
/* 59 */                                        length3++;
                                            }
/* 66 */                                    if (length3 == -1) {
/* 68 */                                        length3 = charSequence2.length();
/* 72 */                                        this.I00ilI0I1 = -1;
/* 74 */                                        i2 = -1;
                                            } else {
/* 76 */                                        i2 = length3 + 4;
/* 78 */                                        this.I00ilI0I1 = i2;
                                            }
/* 80 */                                    if (i2 == i11) {
/* 82 */                                        int i13 = i2 + 1;
/* 84 */                                        this.I00ilI0I1 = i13;
/* 90 */                                        if (i13 > charSequence2.length()) {
/* 92 */                                            this.I00ilI0I1 = -1;
                                                }
                                            } else {
/* 95 */                                        if (i11 < length3) {
/* 97 */                                            charSequence2.charAt(i11);
                                                }
/* 100 */                                       if (i11 < length3) {
/* 104 */                                           charSequence2.charAt(length3 - 1);
                                                }
/* 107 */                                       int i14 = this.I00ilO0;
/* 109 */                                       if (i14 == 1) {
/* 111 */                                           length3 = charSequence2.length();
/* 115 */                                           this.I00ilI0I1 = -1;
/* 117 */                                           if (length3 > i11) {
/* 121 */                                               charSequence2.charAt(length3 - 1);
                                                    }
                                                } else {
/* 126 */                                           this.I00ilO0 = i14 - 1;
                                                }
/* 132 */                                       string = charSequence2.subSequence(i11, length3).toString();
                                            }
                                        } else {
/* 137 */                                   this.I00iiO = 3;
                                        }
                                    }
/* 139 */                           this.I00iiI = string;
/* 143 */                           if (this.I00iiO != 3) {
/* 145 */                               this.I00iiO = 1;
/* 7 */                                 return true;
                                    }
                                }
                            } else {
/* 151 */                       IOOlIIilOl0.I000iOII();
                            }
/* 11 */                    return false;
                    }
                }

                @Override
                public final Object next() {
                    switch (this.I00iOIl) {
                        case 0:
/* 30 */                    if (!hasNext()) {
/* 41 */                        IoOOl0iOl1io.I00000oOI();
                                break;
                            } else {
/* 33 */                        this.I00iiO = 2;
/* 35 */                        String str = this.I00iiI;
/* 38 */                        this.I00iiI = null;
                                break;
                            }
                        default:
/* 10 */                    if (!hasNext()) {
/* 21 */                        IoOOl0iOl1io.I00000oOI();
                                break;
                            } else {
/* 13 */                        this.I00iiO = 2;
/* 15 */                        String str2 = this.I00iiI;
/* 18 */                        this.I00iiI = null;
                                break;
                            }
                    }
/* 24 */            return null;
                }

                @Override
                public final void remove() {
                    switch (this.I00iOIl) {
                        case 0:
/* 17 */                    throw new UnsupportedOperationException();
                        default:
/* 11 */                    throw new UnsupportedOperationException();
                    }
                }
            }
