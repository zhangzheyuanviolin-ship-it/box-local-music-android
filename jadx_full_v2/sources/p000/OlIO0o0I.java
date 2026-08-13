            package p000;

            import java.util.Iterator;
            
            public final class OlIO0o0I implements Iterator {
                public int I00iOIl;
                public String I00iiI;
                public String I00iiO;
                public IO11i1I0 I00iio;
                public boolean I00ilI0I1;
                public int I00ilO0;
                public int I00io1l;
                public IO11i1 I00ioIO;

                @Override
                public final boolean hasNext() {
                    int length;
                    String string;
                    int i;
/* 1 */             int i2 = this.I00iOIl;
/* 5 */             if (i2 == 4) {
/* 165 */               IOOlIIilOl0.I000iOII();
/* 3 */                 return false;
                    }
/* 7 */             int iI001lIiIIo1O = IIlIOloOOO.I001lIiIIo1O(i2);
/* 12 */            if (iI001lIiIIo1O == 0) {
/* 11 */                return true;
                    }
/* 15 */            if (iI001lIiIIo1O != 2) {
/* 17 */                this.I00iOIl = 4;
/* 19 */                IO11i1I0 iO11i1I0 = this.I00iio;
/* 21 */                String str = this.I00iiO;
/* 23 */                int i3 = this.I00ilO0;
                        while (true) {
/* 25 */                    length = this.I00ilO0;
/* 29 */                    if (length == -1) {
/* 151 */                       this.I00iOIl = 3;
/* 153 */                       string = null;
                                break;
                            }
/* 31 */                    IO11i1 iO11i1 = this.I00ioIO;
/* 33 */                    String str2 = this.I00iiO;
/* 35 */                    int length2 = str2.length();
/* 39 */                    lII0I0I01I1l.I000II(length, length2);
                            while (true) {
/* 42 */                        if (length >= length2) {
/* 61 */                            length = -1;
                                    break;
                                }
/* 55 */                        if (str2.charAt(length) == iO11i1.I00000oIO) {
                                    break;
                                }
/* 58 */                        length++;
                            }
/* 62 */                    if (length == -1) {
/* 64 */                        length = str.length();
/* 68 */                        this.I00ilO0 = -1;
/* 70 */                        i = -1;
                            } else {
/* 72 */                        i = length + 1;
/* 74 */                        this.I00ilO0 = i;
                            }
/* 76 */                    if (i == i3) {
/* 78 */                        int i4 = i + 1;
/* 80 */                        this.I00ilO0 = i4;
/* 86 */                        if (i4 > str.length()) {
/* 88 */                            this.I00ilO0 = -1;
                                }
                            } else {
/* 91 */                        if (i3 < length) {
/* 93 */                            str.charAt(i3);
/* 96 */                            iO11i1I0.getClass();
                                }
/* 99 */                        if (length > i3) {
/* 103 */                           str.charAt(length - 1);
/* 106 */                           iO11i1I0.getClass();
                                }
/* 111 */                       if (!this.I00ilI0I1 || i3 != length) {
                                    break;
                                }
/* 115 */                       i3 = this.I00ilO0;
                            }
                        }
/* 118 */               int i5 = this.I00io1l;
/* 120 */               if (i5 == 1) {
/* 122 */                   length = str.length();
/* 126 */                   this.I00ilO0 = -1;
/* 128 */                   if (length > i3) {
/* 132 */                       str.charAt(length - 1);
/* 135 */                       iO11i1I0.getClass();
                            }
                        } else {
/* 140 */                   this.I00io1l = i5 - 1;
                        }
/* 146 */               string = str.subSequence(i3, length).toString();
/* 154 */               this.I00iiI = string;
/* 158 */               if (this.I00iOIl != 3) {
/* 160 */                   this.I00iOIl = 1;
/* 11 */                    return true;
                        }
                    }
/* 3 */             return false;
                }

                @Override
                public final Object next() {
/* 5 */             if (!hasNext()) {
/* 16 */                IoOOl0iOl1io.I00000oOI();
/* 19 */                return null;
                    }
/* 8 */             this.I00iOIl = 2;
/* 10 */            String str = this.I00iiI;
/* 13 */            this.I00iiI = null;
/* 15 */            return str;
                }

                @Override
                public final void remove() {
/* 29 */            throw new UnsupportedOperationException();
                }
            }
