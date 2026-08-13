            package p000;

            import java.util.Enumeration;
            import java.util.HashMap;
            
            public final class Il1I1I1Io implements Enumeration {
                public final int I00000oIO;
                public int I00000oOI;

                public Il1I1I1Io(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final boolean hasMoreElements() {
                    switch (this.I00000oIO) {
                        case 0:
/* 17 */                    int i = this.I00000oOI;
/* 19 */                    Il1O11[] il1O11Arr = Il1IO1oOioO0.I0000Il00O;
/* 21 */                    if (i < 4) {
                                break;
                            }
                            break;
                        default:
/* 9 */                     int i2 = this.I00000oOI;
/* 11 */                    Il1O11[] il1O11Arr2 = Il1IO1oOioO0.I0000Il00O;
/* 13 */                    if (i2 < 4) {
                                break;
                            }
                            break;
                    }
/* 4 */             return true;
                }

                @Override
                public final Object nextElement() {
                    switch (this.I00000oIO) {
                        case 0:
/* 20 */                    HashMap map = new HashMap();
/* 31 */                    for (Il1O11 il1O11 : Il1IO1oOioO0.I0000O[this.I00000oOI]) {
/* 37 */                        map.put(il1O11.I00000oOI, il1O11);
                            }
                            this.I00000oOI++;
/* 49 */                    return map;
                        default:
                            this.I00000oOI++;
/* 14 */                    return new HashMap();
                    }
                }
            }
