            package p000;

            import androidx.work.impl.WorkDatabase;
            import java.util.Iterator;
            
            public final class IIoOlOliI1 implements Runnable {
                public final int I00iOIl;
                public WorkDatabase I00iiI;
                public String I00iiO;
                public i01IlOO I00iio;

                public IIoOlOliI1(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final void run() {
                    switch (this.I00iOIl) {
                        case 0:
/* 41 */                    WorkDatabase workDatabase = this.I00iiI;
/* 43 */                    String str = this.I00iiO;
/* 45 */                    i01IlOO i01iloo = this.I00iio;
/* 55 */                    Iterator<String> it = workDatabase.I001lIiIIo1O().getUnfinishedWorkWithName(str).iterator();
/* 63 */                    while (it.hasNext()) {
/* 71 */                        iOl0OOll.I00000oIO(i01iloo, it.next());
                            }
                            break;
                        default:
/* 6 */                     WorkDatabase workDatabase2 = this.I00iiI;
/* 8 */                     String str2 = this.I00iiO;
/* 10 */                    i01IlOO i01iloo2 = this.I00iio;
/* 20 */                    Iterator<String> it2 = workDatabase2.I001lIiIIo1O().getUnfinishedWorkWithTag(str2).iterator();
/* 28 */                    while (it2.hasNext()) {
/* 36 */                        iOl0OOll.I00000oIO(i01iloo2, it2.next());
                            }
                            break;
                    }
                }
            }
