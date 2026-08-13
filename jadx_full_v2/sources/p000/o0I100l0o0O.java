            package p000;

            import java.sql.Timestamp;
            import java.util.ArrayList;
            import java.util.Date;
            import java.util.concurrent.atomic.AtomicLong;
            import java.util.concurrent.atomic.AtomicLongArray;
            
/* 8 */     public final class o0I100l0o0O extends llOl001olOi {
                public static final loIiOOlI0oI1 I0000Il00O = new loIiOOlI0oI1(6);
                public final int I00000oIO;
                public llOl001olOi I00000oOI;

                public o0I100l0o0O(llOl001olOi llol001oloi) {
/* 2 */             this.I00000oIO = 2;
/* 7 */             this.I00000oOI = llol001oloi;
                }

                @Override
                public final Object I00000oIO(o0IlOioo o0iloioo) {
                    switch (this.I00000oIO) {
                        case 0:
/* 119 */                   Date date = (Date) this.I00000oOI.I00000oIO(o0iloioo);
/* 121 */                   if (date != null) {
/* 129 */                       return new Timestamp(date.getTime());
                            }
/* 3 */                     return null;
                        case 1:
/* 98 */                    llOl001olOi llol001oloi = this.I00000oOI;
/* 100 */                   if (llol001oloi != null) {
/* 102 */                       return llol001oloi.I00000oIO(o0iloioo);
                            }
/* 109 */                   I000II.I001IO000("Adapter for type with cyclic dependency has been used before dependency has been resolved");
/* 3 */                     return null;
                        case 2:
/* 93 */                    return this.I00000oOI.I00000oIO(o0iloioo);
                        case 3:
/* 27 */                    ArrayList arrayList = new ArrayList();
/* 30 */                    o0iloioo.I00Io1lO();
/* 37 */                    while (o0iloioo.I00Ol00()) {
/* 55 */                        arrayList.add(Long.valueOf(((Number) this.I00000oOI.I00000oIO(o0iloioo)).longValue()));
                            }
/* 59 */                    o0iloioo.I00IoiI();
/* 62 */                    int size = arrayList.size();
/* 68 */                    AtomicLongArray atomicLongArray = new AtomicLongArray(size);
/* 72 */                    for (int i = 0; i < size; i++) {
/* 84 */                        atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
                            }
/* 90 */                    return atomicLongArray;
                        default:
/* 21 */                    return new AtomicLong(((Number) this.I00000oOI.I00000oIO(o0iloioo)).longValue());
                    }
                }

/* 9 */         public o0I100l0o0O(int i) {
/* 10 */            this.I00000oIO = i;
                }
            }
