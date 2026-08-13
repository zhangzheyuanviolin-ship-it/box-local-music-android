            package p000;
            
            public final class OlIiloIloiio implements IOoil1iiIilo, Ii011lOOlI1 {
                public IO10IlI1l011 I00iOIl;
                public Ii00l101O I00iiI;

                @Override
                public final Ii011lOOlI1 getCallerFrame() {
/* 1 */             IO10IlI1l011 iO10IlI1l011 = this.I00iOIl;
/* 3 */             if (iO10IlI1l011 != null) {
/* 5 */                 return iO10IlI1l011;
                    }
/* 6 */             return null;
                }

                @Override
                public final Ii00l101O getContext() {
/* 1 */             return this.I00iiI;
                }

                @Override
                public final void resumeWith(Object obj) {
/* 3 */             this.I00iOIl.resumeWith(obj);
                }
            }
