            package p000;

            import androidx.work.impl.WorkDatabase;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.concurrent.Callable;
            import java.util.concurrent.ExecutorService;
            
            public final class IiIl1O1 implements Callable {
                public final int I00000oIO;
                public Object I00000oOI;
                public Object I0000Il00O;
                public Object I0000O;

                public IiIl1O1(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final Object call() {
                    switch (this.I00000oIO) {
                        case 0:
/* 42 */                    IiIl1iOoI01I iiIl1iOoI01I = (IiIl1iOoI01I) this.I00000oOI;
/* 46 */                    Callable callable = (Callable) this.I0000Il00O;
/* 50 */                    iiOlilo0IIIl iiolilo0iiil = (iiOlilo0IIIl) this.I0000O;
/* 52 */                    ExecutorService executorService = iiIl1iOoI01I.I00iOIl;
/* 58 */                    I0iOo0oioiO i0iOo0oioiO = new I0iOo0oioiO(27);
/* 61 */                    i0iOo0oioiO.I00iiI = callable;
/* 63 */                    i0iOo0oioiO.I00iiO = iiolilo0iiil;
/* 65 */                    VarHandle.storeStoreFence();
/* 68 */                    return executorService.submit(i0iOo0oioiO);
                        default:
/* 8 */                     OOIo1i0 oOIo1i0 = (OOIo1i0) this.I00000oOI;
/* 12 */                    ArrayList arrayList = (ArrayList) this.I0000Il00O;
/* 16 */                    String str = (String) this.I0000O;
/* 18 */                    WorkDatabase workDatabase = oOIo1i0.I0000oI00;
/* 28 */                    arrayList.addAll(workDatabase.I001lllioOl().getTagsForWorkSpecId(str));
/* 35 */                    return workDatabase.I001lIiIIo1O().getWorkSpec(str);
                    }
                }
            }
