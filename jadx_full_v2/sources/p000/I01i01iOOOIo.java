            package p000;

            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            
            public final class I01i01iOOOIo implements IllOOo00lI {
                public final int I00iOIl;
                public List I00iiI;

                public I01i01iOOOIo(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke() {
                    switch (this.I00iOIl) {
                        case 0:
/* 9 */                     List list = this.I00iiI;
/* 15 */                    ArrayList arrayList = new ArrayList();
/* 18 */                    Iterator it = list.iterator();
/* 26 */                    while (it.hasNext()) {
/* 36 */                        O0iIl1 o0iIl1I00000oIO = lOoll01ll0I.I00000oIO((O0iIl1) ((O0iIo0i1) it.next()));
/* 40 */                        if (o0iIl1I00000oIO != null) {
/* 42 */                            arrayList.add(o0iIl1I00000oIO);
                                }
                            }
/* 46 */                    return arrayList;
                        default:
/* 6 */                     return this.I00iiI;
                    }
                }
            }
