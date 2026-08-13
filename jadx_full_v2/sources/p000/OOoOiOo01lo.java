            package p000;

            import java.lang.ref.SoftReference;
            
            public final class OOoOiOo01lo implements IllOOo00lI {
                public static final lo1iloiI1 I00iiO = new lo1iloiI1(14);
                public IllOOo00lI I00iOIl;
                public volatile SoftReference I00iiI;

                @Override
                public final Object invoke() {
                    Object obj;
/* 1 */             Object obj2 = I00iiO;
/* 3 */             SoftReference softReference = this.I00iiI;
/* 5 */             if (softReference != null && (obj = softReference.get()) != null) {
/* 13 */                if (obj == obj2) {
/* 15 */                    return null;
                        }
/* 17 */                return obj;
                    }
/* 20 */            Object objInvoke = this.I00iOIl.invoke();
/* 26 */            if (objInvoke != null) {
/* 29 */                obj2 = objInvoke;
                    }
/* 33 */            this.I00iiI = new SoftReference(obj2);
/* 113 */           return objInvoke;
                }
            }
