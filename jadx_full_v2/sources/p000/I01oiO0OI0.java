            package p000;

            import java.util.Map;
            
            public final class I01oiO0OI0 implements IiiO1li1 {
                public final int I00000oIO;
                public Object I00000oOI;
                public Object I0000Il00O;
                public Object I0000O;

                public I01oiO0OI0(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final void I00000oOI() {
                    I01O1lIi i01O1lIiI000iOII;
                    switch (this.I00000oIO) {
                        case 0:
/* 157 */                   ((IllOOo00lI) this.I00000oOI).invoke();
/* 172 */                   ((O0oiOi) this.I0000Il00O).I000iOII().I00ooIo0((I01oi1lO0O1o) this.I0000O);
                            break;
                        case 1:
/* 136 */                   Ol1o0O0O0 ol1o0O0O0 = (Ol1o0O0O0) this.I00000oOI;
/* 138 */                   Object obj = this.I0000Il00O;
/* 140 */                   ol1o0O0O0.remove(obj);
/* 149 */                   ((I10llI0II11l) this.I0000O).I0000oI00.I000iOII(obj);
                            break;
                        case 2:
/* 113 */                   Iii0iOoIo iii0iOoIo = (Iii0iOoIo) this.I00000oOI;
/* 117 */                   OI1OloOIO1O oI1OloOIO1O = (OI1OloOIO1O) this.I0000Il00O;
/* 123 */                   iii0iOoIo.I00000oOI().I00000oOI(oI1OloOIO1O);
/* 130 */                   ((Ol1o0O0O0) this.I0000O).remove(oI1OloOIO1O);
                            break;
                        case 3:
/* 94 */                    ((O0oiOi) this.I0000Il00O).I000iOII().I00ooIo0((O0oi0oIO1i) this.I00000oOI);
/* 103 */                   I1loIlo0O0i i1loIlo0O0i = (I1loIlo0O0i) ((OOo0ooi) this.I0000O).I00iOIl;
/* 105 */                   if (i1loIlo0O0i != null) {
/* 107 */                       i1loIlo0O0i.I00000oIO();
                                break;
                            }
                            break;
                        case 4:
/* 46 */                    O0oiOi o0oiOi = (O0oiOi) this.I0000Il00O;
/* 48 */                    if (o0oiOi != null && (i01O1lIiI000iOII = o0oiOi.I000iOII()) != null) {
/* 60 */                        i01O1lIiI000iOII.I00ooIo0((I01oi1lO0O1o) this.I00000oOI);
                            }
/* 65 */                    IOioOloI0o0 iOioOloI0o0 = (IOioOloI0o0) this.I0000O;
/* 67 */                    O0oOOiI0 o0oOOiI0 = O0oOOiI0.ON_DESTROY;
/* 69 */                    iOioOloI0o0.getClass();
/* 76 */                    iOioOloI0o0.I00iiI = o0oOOiI0.I00000oIO();
/* 78 */                    iOioOloI0o0.I00000oIO();
                            break;
                        default:
/* 8 */                     OiIil1il oiIil1il = (OiIil1il) this.I00000oOI;
/* 10 */                    OI10I1IoI0Ol oI10I1IoI0Ol = oiIil1il.I00iiI;
/* 12 */                    Object obj2 = this.I0000Il00O;
/* 14 */                    Object objI000iOII = oI10I1IoI0Ol.I000iOII(obj2);
/* 20 */                    OiIl1O1OO oiIl1O1OO = (OiIl1O1OO) this.I0000O;
/* 22 */                    if (objI000iOII == oiIl1O1OO) {
/* 24 */                        Map map = oiIil1il.I00iOIl;
/* 26 */                        Map mapI0000O = oiIl1O1OO.I0000O();
/* 34 */                        if (!mapI0000O.isEmpty()) {
/* 40 */                            map.put(obj2, mapI0000O);
                                    break;
                                } else {
/* 36 */                            map.remove(obj2);
                                    break;
                                }
                            }
                            break;
                    }
                }
            }
