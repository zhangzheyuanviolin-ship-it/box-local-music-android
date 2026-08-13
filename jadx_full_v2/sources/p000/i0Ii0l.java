            package p000;

            import java.io.Serializable;
            
            public final class i0Ii0l extends i0OIlooi0 implements Serializable {
                public static final i0Ii0l I00iiI;
                public static final i0Ii0l I00iiO;
                public final transient i0IOo0 I00iOIl;

                static {
/* 3 */             i0IO00li1 i0io00li1 = i0IOo0.I00lll10;
/* 10 */            I00iiI = new i0Ii0l(i0Iioo0o1liI.I00o101lO);
/* 16 */            Object[] objArr = {i0IioIo.I00iiO};
/* 22 */            for (int i = 0; i < 1; i++) {
/* 26 */                if (objArr[i] == null) {
/* 37 */                    IOOlIIilOl0.I000II(Oi010OO0.I000oI1ioi(i, "at index "));
/* 40 */                    return;
                        }
                    }
/* 48 */            I00iiO = new i0Ii0l(i0IOo0.I001lIiIIo1O(1, objArr));
                }

                public i0Ii0l(i0IOo0 i0ioo0) {
/* 4 */             this.I00iOIl = i0ioo0;
                }

                @Override
                public final i0Ii1O10ol0 I00000oIO() {
/* 1 */             i0IOo0 i0ioo0 = this.I00iOIl;
/* 7 */             if (i0ioo0.isEmpty()) {
/* 9 */                 return i0IlO1il1o.I00oO101o;
                    }
/* 14 */            i0IioIo i0iioio = i0IioIo.I00iiO;
/* 18 */            return new i0IlOIiO(i0ioo0, i0Iill0.I00iiO);
                }
            }
