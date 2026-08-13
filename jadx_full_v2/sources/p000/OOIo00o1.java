            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.concurrent.Executor;
            
            public final class OOIo00o1 implements IOo1llI {
                public final int I00000oIO;
                public OoIlIoo1oiOo I00000oOI;

                public OOIo00o1(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final void accept(Object obj) throws Exception {
/* 1 */             int i = this.I00000oIO;
/* 3 */             OoIlIoo1oiOo ooIlIoo1oiOo = this.I00000oOI;
/* 5 */             I1lIII10oIl i1lIII10oIl = (I1lIII10oIl) obj;
                    switch (i) {
                        case 0:
/* 58 */                    if (!i1lIII10oIl.I00000oIO.I000II.I000II) {
/* 68 */                        Executor executor = (Executor) ooIlIoo1oiOo.I00iiO;
/* 73 */                        OOIo0Ol1OO oOIo0Ol1OO = new OOIo0Ol1OO(1);
/* 76 */                        oOIo0Ol1OO.I00iiI = ooIlIoo1oiOo;
/* 78 */                        oOIo0Ol1OO.I00iiO = i1lIII10oIl;
/* 80 */                        VarHandle.storeStoreFence();
/* 83 */                        executor.execute(oOIo0Ol1OO);
                                break;
                            } else {
/* 62 */                        i1lIII10oIl.I00000oOI.close();
                                break;
                            }
                        default:
/* 16 */                    if (!i1lIII10oIl.I00000oIO.I000II.I000II) {
/* 33 */                        Executor executor2 = (Executor) ooIlIoo1oiOo.I00iiO;
/* 38 */                        OOIo0Ol1OO oOIo0Ol1OO2 = new OOIo0Ol1OO(0);
/* 41 */                        oOIo0Ol1OO2.I00iiI = ooIlIoo1oiOo;
/* 43 */                        oOIo0Ol1OO2.I00iiO = i1lIII10oIl;
/* 45 */                        VarHandle.storeStoreFence();
/* 48 */                        executor2.execute(oOIo0Ol1OO2);
                                break;
                            } else {
/* 22 */                        l11I11lO.I0000oI00("ProcessingNode", "The postview image is closed due to request aborted");
/* 27 */                        i1lIII10oIl.I00000oOI.close();
                                break;
                            }
                    }
                }
            }
