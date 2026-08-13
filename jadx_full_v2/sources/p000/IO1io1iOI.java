            package p000;

            import com.google.ai.edge.gallery.data.ModelDownloadStatusType;
            import java.lang.invoke.VarHandle;
            import java.util.Collections;
            import java.util.List;
            
            public final class IO1io1iOI implements IllOOo00lI {
                public final int I00iOIl;
                public IlliIl1l11O I00iiI;
                public O1oIOiI11o0 I00iiO;

                @Override
                public final Object invoke() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 33 */                    IlliIl1l11O illiIl1l11O = this.I00iiI;
/* 35 */                    O1oIOiI11o0 o1oIOiI11o0 = this.I00iiO;
/* 39 */                    List list = o1oIOiI11o0.I001IO000;
/* 50 */                    IO1i1i1IlO iO1i1i1IlO = new IO1i1i1IlO(IO1iIoo.I00l0OO0IO, IO1loo.I00iiO, 0.0f, null, false, 60);
/* 53 */                    iO1i1i1IlO.I000II = list;
/* 55 */                    VarHandle.storeStoreFence();
/* 62 */                    illiIl1l11O.invoke(o1oIOiI11o0, Collections.singletonList(iO1i1i1IlO));
                            break;
                        default:
/* 8 */                     IlliIl1l11O illiIl1l11O2 = this.I00iiI;
/* 10 */                    O1oIOiI11o0 o1oIOiI11o02 = this.I00iiO;
/* 12 */                    ModelDownloadStatusType modelDownloadStatusType = ModelDownloadStatusType.SUCCEEDED;
/* 14 */                    long j = o1oIOiI11o02.I000OOo1O;
/* 29 */                    illiIl1l11O2.invoke(o1oIOiI11o02, new O1oIo0iI00(modelDownloadStatusType, j, j, null, 0L, 0L, 56));
                            break;
                    }
/* 32 */            return ooiIlOl1iI;
                }
            }
