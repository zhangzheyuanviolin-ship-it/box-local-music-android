            package p000;

            import java.util.Iterator;
            
            public final class iO1iOoi1O implements Iterator {
                public final int I00iOIl;
                public int I00iiI;
                public Object I00iiO;

                public iO1iOoi1O(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final boolean hasNext() {
                    switch (this.I00iOIl) {
                        case 0:
/* 50 */                    if (this.I00iiI < ((iOO00I0O) this.I00iiO).I00iOIl.length()) {
                                break;
                            }
                            break;
                        case 1:
/* 34 */                    if (this.I00iiI < ((iOO00I0O) this.I00iiO).I00iOIl.length()) {
                                break;
                            }
                            break;
                        default:
/* 18 */                    if (this.I00iiI < ((i1ollIol0I0) this.I00iiO).I000lI()) {
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
/* 96 */                    String str = ((iOO00I0O) this.I00iiO).I00iOIl;
/* 98 */                    int i = this.I00iiI;
/* 104 */                   if (i >= str.length()) {
/* 120 */                       IoOOl0iOl1io.I00000oOI();
                                break;
                            } else {
/* 110 */                       this.I00iiI = i + 1;
                                break;
                            }
                        case 1:
/* 59 */                    String str2 = ((iOO00I0O) this.I00iiO).I00iOIl;
/* 61 */                    int i2 = this.I00iiI;
/* 67 */                    if (i2 >= str2.length()) {
/* 88 */                        IoOOl0iOl1io.I00000oOI();
                                break;
                            } else {
/* 73 */                        this.I00iiI = i2 + 1;
                                break;
                            }
                        default:
/* 9 */                     i1ollIol0I0 i1olliol0i0 = (i1ollIol0I0) this.I00iiO;
/* 11 */                    int i3 = this.I00iiI;
/* 13 */                    int iI000lI = i1olliol0i0.I000lI();
/* 17 */                    int i4 = this.I00iiI;
/* 19 */                    if (i3 >= iI000lI) {
/* 51 */                        OIiilo1Ool0o.I000II(Oi010OO0.I00100l0(i4, "Out of bounds index: ", new StringBuilder(String.valueOf(i4).length() + 21)));
                                break;
                            } else {
/* 23 */                        this.I00iiI = i4 + 1;
                                break;
                            }
                    }
/* 3 */             return null;
                }
            }
