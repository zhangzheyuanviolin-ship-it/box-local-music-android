            package p000;

            import java.text.BreakIterator;
            
            public final class I01lolI0O extends I01loIooI {
                public static I01lolI0O I0000oI00;
                public static I01lolI0O I0001Ioi1lo;
                public final int I0000Il00O;
                public BreakIterator I0000O;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I01lolI0O(int i) {
/* 4 */             super(0);
/* 1 */             this.I0000Il00O = i;
                }

                @Override
                public final int[] I000iOII(int i) {
                    switch (this.I0000Il00O) {
                        case 0:
/* 104 */                   int length = I000oI1ioi().length();
/* 108 */                   if (length <= 0 || i >= length) {
/* 4 */                         return null;
                            }
/* 114 */                   if (i < 0) {
/* 116 */                       i = 0;
                            }
/* 135 */                   do {
/* 117 */                       BreakIterator breakIterator = this.I0000O;
/* 119 */                       if (breakIterator == null) {
/* 160 */                           O0000Ioio00.I000OOo1O("impl");
/* 163 */                           throw null;
                                }
/* 121 */                       boolean zIsBoundary = breakIterator.isBoundary(i);
/* 125 */                       BreakIterator breakIterator2 = this.I0000O;
/* 127 */                       if (zIsBoundary) {
/* 142 */                           if (breakIterator2 == null) {
/* 156 */                               O0000Ioio00.I000OOo1O("impl");
/* 159 */                               throw null;
                                    }
/* 144 */                           int iFollowing = breakIterator2.following(i);
/* 148 */                           if (iFollowing == -1) {
/* 4 */                                 return null;
                                    }
/* 151 */                           return I000o00OoI0I(i, iFollowing);
                                }
/* 129 */                       if (breakIterator2 == null) {
/* 138 */                           O0000Ioio00.I000OOo1O("impl");
/* 141 */                           throw null;
                                }
/* 131 */                       i = breakIterator2.following(i);
/* 135 */                   } while (i != -1);
/* 4 */                     return null;
                        default:
/* 19 */                    if (I000oI1ioi().length() <= 0 || i >= I000oI1ioi().length()) {
/* 4 */                         return null;
                            }
/* 33 */                    if (i < 0) {
/* 35 */                        i = 0;
                            }
/* 40 */                    while (!I001lllioOl(i) && (!I001lllioOl(i) || (i != 0 && I001lllioOl(i - 1)))) {
/* 59 */                        BreakIterator breakIterator3 = this.I0000O;
/* 61 */                        if (breakIterator3 == null) {
/* 70 */                            O0000Ioio00.I000OOo1O("impl");
/* 73 */                            throw null;
                                }
/* 63 */                        i = breakIterator3.following(i);
/* 67 */                        if (i == -1) {
/* 4 */                             return null;
                                }
                            }
/* 74 */                    BreakIterator breakIterator4 = this.I0000O;
/* 76 */                    if (breakIterator4 == null) {
/* 96 */                        O0000Ioio00.I000OOo1O("impl");
/* 99 */                        throw null;
                            }
/* 78 */                    int iFollowing2 = breakIterator4.following(i);
/* 82 */                    if (iFollowing2 == -1 || !I001lIiIIo1O(iFollowing2)) {
/* 4 */                         return null;
                            }
/* 91 */                    return I000o00OoI0I(i, iFollowing2);
                    }
                }

                @Override
                public final int[] I001i1lo1io(int i) {
                    switch (this.I0000Il00O) {
                        case 0:
/* 97 */                    int length = I000oI1ioi().length();
/* 101 */                   if (length <= 0 || i <= 0) {
/* 3 */                         return null;
                            }
/* 107 */                   if (i > length) {
/* 109 */                       i = length;
                            }
/* 128 */                   do {
/* 110 */                       BreakIterator breakIterator = this.I0000O;
/* 112 */                       if (breakIterator == null) {
/* 153 */                           O0000Ioio00.I000OOo1O("impl");
/* 156 */                           throw null;
                                }
/* 114 */                       boolean zIsBoundary = breakIterator.isBoundary(i);
/* 118 */                       BreakIterator breakIterator2 = this.I0000O;
/* 120 */                       if (zIsBoundary) {
/* 135 */                           if (breakIterator2 == null) {
/* 149 */                               O0000Ioio00.I000OOo1O("impl");
/* 152 */                               throw null;
                                    }
/* 137 */                           int iPreceding = breakIterator2.preceding(i);
/* 141 */                           if (iPreceding == -1) {
/* 3 */                                 return null;
                                    }
/* 144 */                           return I000o00OoI0I(iPreceding, i);
                                }
/* 122 */                       if (breakIterator2 == null) {
/* 131 */                           O0000Ioio00.I000OOo1O("impl");
/* 134 */                           throw null;
                                }
/* 124 */                       i = breakIterator2.preceding(i);
/* 128 */                   } while (i != -1);
/* 3 */                     return null;
                        default:
/* 14 */                    int length2 = I000oI1ioi().length();
/* 18 */                    if (length2 <= 0 || i <= 0) {
/* 3 */                         return null;
                            }
/* 24 */                    if (i > length2) {
/* 26 */                        i = length2;
                            }
/* 27 */                    while (i > 0 && !I001lllioOl(i - 1) && !I001lIiIIo1O(i)) {
/* 43 */                        BreakIterator breakIterator3 = this.I0000O;
/* 45 */                        if (breakIterator3 == null) {
/* 54 */                            O0000Ioio00.I000OOo1O("impl");
/* 57 */                            throw null;
                                }
/* 47 */                        i = breakIterator3.preceding(i);
/* 51 */                        if (i == -1) {
/* 3 */                             return null;
                                }
                            }
/* 58 */                    BreakIterator breakIterator4 = this.I0000O;
/* 60 */                    if (breakIterator4 == null) {
/* 89 */                        O0000Ioio00.I000OOo1O("impl");
/* 92 */                        throw null;
                            }
/* 62 */                    int iPreceding2 = breakIterator4.preceding(i);
/* 66 */                    if (iPreceding2 == -1 || !I001lllioOl(iPreceding2)) {
/* 3 */                         return null;
                            }
/* 74 */                    if (iPreceding2 == 0 || !I001lllioOl(iPreceding2 - 1)) {
/* 84 */                        return I000o00OoI0I(iPreceding2, i);
                            }
/* 3 */                     return null;
                    }
                }

                public final void I001l0I00(String str) {
                    switch (this.I0000Il00O) {
                        case 0:
/* 23 */                    this.I00000oIO = str;
/* 25 */                    BreakIterator breakIterator = this.I0000O;
/* 27 */                    if (breakIterator != null) {
/* 29 */                        breakIterator.setText(str);
/* 32 */                        return;
                            } else {
/* 33 */                        O0000Ioio00.I000OOo1O("impl");
/* 36 */                        throw null;
                            }
                        default:
/* 9 */                     this.I00000oIO = str;
/* 11 */                    BreakIterator breakIterator2 = this.I0000O;
/* 13 */                    if (breakIterator2 != null) {
/* 15 */                        breakIterator2.setText(str);
/* 18 */                        return;
                            } else {
/* 19 */                        O0000Ioio00.I000OOo1O("impl");
/* 22 */                        throw null;
                            }
                    }
                }

                public boolean I001lIiIIo1O(int i) {
/* 1 */             if (i <= 0 || !I001lllioOl(i - 1)) {
/* 29 */                return false;
                    }
                    return i == I000oI1ioi().length() || !I001lllioOl(i);
                }

                public boolean I001lllioOl(int i) {
/* 1 */             if (i < 0 || i >= I000oI1ioi().length()) {
/* 26 */                return false;
                    }
/* 21 */            return Character.isLetterOrDigit(I000oI1ioi().codePointAt(i));
                }
            }
