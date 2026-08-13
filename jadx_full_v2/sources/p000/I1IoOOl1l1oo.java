            package p000;

            import java.util.Iterator;
            import java.util.NoSuchElementException;
            
/* 10 */    public final class I1IoOOl1l1oo implements Iterator {
                public final int I00iOIl;
                public int I00iiI;
                public Object I00iiO;

                public I1IoOOl1l1oo(Object[] objArr) {
/* 2 */             this.I00iOIl = 0;
/* 7 */             this.I00iiI = 0;
/* 9 */             this.I00iiO = objArr;
                }

                @Override
                public final boolean hasNext() {
                    switch (this.I00iOIl) {
                        case 0:
/* 85 */                    if (this.I00iiI < ((Object[]) this.I00iiO).length) {
                                break;
                            }
                            break;
                        case 1:
/* 59 */                    int i = this.I00iiI;
/* 63 */                    i1Ol01i1 i1ol01i1 = (i1Ol01i1) this.I00iiO;
/* 74 */                    if (i < i1ol01i1.I0000O() - i1ol01i1.I00000oOI()) {
                                break;
                            }
                            break;
                        case 2:
/* 55 */                    if (this.I00iiI < ((iil1lo) ((I1IlioI1o1I) this.I00iiO).I00iiI).I0000oI00) {
                                break;
                            }
                            break;
                        case 3:
/* 24 */                    int i2 = this.I00iiI;
/* 28 */                    ilI11lO01oo ili11lo01oo = (ilI11lO01oo) this.I00iiO;
/* 39 */                    if (i2 < ili11lo01oo.I00000oOI() - ili11lo01oo.I0000O()) {
                                break;
                            }
                            break;
                        default:
/* 20 */                    if (this.I00iiI < ((o1I0O0l1o0l) ((I1IlioI1o1I) this.I00iiO).I00iiI).I0000oI00) {
                                break;
                            }
                            break;
                    }
/* 4 */             return true;
                }

                @Override
                public final Object next() {
                    switch (this.I00iOIl) {
                        case 0:
/* 131 */                   int i = this.I00iiI;
/* 135 */                   Object[] objArr = (Object[]) this.I00iiO;
/* 138 */                   if (i != objArr.length) {
/* 142 */                       this.I00iiI = i + 1;
/* 144 */                       return objArr[i];
                            }
/* 168 */                   throw new NoSuchElementException("Out of elements: " + this.I00iiI);
                        case 1:
/* 94 */                    int i2 = this.I00iiI;
/* 98 */                    i1Ol01i1 i1ol01i1 = (i1Ol01i1) this.I00iiO;
/* 109 */                   if (i2 >= i1ol01i1.I0000O() - i1ol01i1.I00000oOI()) {
/* 127 */                       IoOOl0iOl1io.I00000oOI();
/* 3 */                         return null;
                            }
/* 122 */                   Object obj = i1ol01i1.I00iiI.I00iiI[i1ol01i1.I00000oOI() + i2];
/* 124 */                   this.I00iiI = i2 + 1;
/* 130 */                   return obj;
                        case 2:
/* 75 */                    iil1lo iil1loVar = (iil1lo) ((I1IlioI1o1I) this.I00iiO).I00iiI;
/* 77 */                    int[] iArr = iil1loVar.I0000O;
/* 79 */                    int i3 = this.I00iiI;
/* 83 */                    this.I00iiI = i3 + 1;
/* 89 */                    return iil1loVar.I0000O(iArr[i3] & 31);
                        case 3:
/* 32 */                    int i4 = this.I00iiI;
/* 36 */                    ilI11lO01oo ili11lo01oo = (ilI11lO01oo) this.I00iiO;
/* 47 */                    if (i4 >= ili11lo01oo.I00000oOI() - ili11lo01oo.I0000O()) {
/* 65 */                        IoOOl0iOl1io.I00000oOI();
/* 3 */                         return null;
                            }
/* 58 */                    Object obj2 = ili11lo01oo.I00iiI.I00iiI[ili11lo01oo.I0000O() + i4];
/* 62 */                    this.I00iiI = i4 + 1;
/* 68 */                    return obj2;
                        default:
/* 7 */                     int i5 = this.I00iiI;
/* 11 */                    this.I00iiI = i5 + 1;
/* 19 */                    o1I0O0l1o0l o1i0o0l1o0l = (o1I0O0l1o0l) ((I1IlioI1o1I) this.I00iiO).I00iiI;
/* 27 */                    return o1i0o0l1o0l.I0000O(o1i0o0l1o0l.I0000O[i5] & 31);
                    }
                }

                @Override
                public final void remove() {
                    switch (this.I00iOIl) {
                        case 0:
/* 37 */                    throw new UnsupportedOperationException("Cannot remove element from an Array.");
                        case 1:
/* 29 */                    throw new UnsupportedOperationException();
                        case 2:
/* 23 */                    throw new UnsupportedOperationException();
                        case 3:
/* 17 */                    throw new UnsupportedOperationException();
                        default:
/* 11 */                    throw new UnsupportedOperationException();
                    }
                }

/* 11 */        public I1IoOOl1l1oo(int i) {
/* 12 */            this.I00iOIl = i;
                }
            }
