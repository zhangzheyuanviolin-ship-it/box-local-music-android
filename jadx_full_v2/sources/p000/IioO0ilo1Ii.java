            package p000;

            import java.util.ArrayList;
            
            public final class IioO0ilo1Ii implements IOo1llI {
                public final int I00000oIO;
                public Object I00000oOI;

                @Override
                public final void accept(Object obj) {
                    switch (this.I00000oIO) {
                        case 0:
/* 81 */                    ((IOo1llI) this.I00000oOI).accept(obj);
/* 84 */                    return;
                        case 1:
/* 59 */                    IliiOioI1l1I iliiOioI1l1I = (IliiOioI1l1I) obj;
/* 61 */                    if (iliiOioI1l1I == null) {
/* 66 */                        iliiOioI1l1I = new IliiOioI1l1I(-3);
                            }
/* 73 */                    ((IoloOio0I) this.I00000oOI).I00Iooi00oi(iliiOioI1l1I);
/* 76 */                    return;
                        default:
/* 6 */                     IliiOioI1l1I iliiOioI1l1I2 = (IliiOioI1l1I) obj;
                            synchronized (IliiOlIoO.I0000Il00O) {
                                try {
/* 11 */                            Ol0Ii10o1 ol0Ii10o1 = IliiOlIoO.I0000O;
/* 21 */                            ArrayList arrayList = (ArrayList) ol0Ii10o1.get((String) this.I00000oOI);
/* 23 */                            if (arrayList == null) {
/* 56 */                                return;
                                    }
/* 33 */                            ol0Ii10o1.remove((String) this.I00000oOI);
/* 42 */                            for (int i = 0; i < arrayList.size(); i++) {
/* 50 */                                ((IOo1llI) arrayList.get(i)).accept(iliiOioI1l1I2);
                                    }
/* 56 */                            return;
                                } finally {
                                }
                            }
                    }
                }
            }
