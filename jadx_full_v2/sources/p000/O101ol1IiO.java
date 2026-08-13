            package p000;

            import java.util.List;
            
            public final class O101ol1IiO extends O101ol1lilo0 {
                @Override
                public final void I00000oIO(long j, Object obj) {
/* 10 */            ((I01Iol) ((Iool0o0iOI) Ooil11Oi.I000OiO(j, obj))).I00iOIl = false;
                }

                @Override
                public final void I00000oOI(Object obj, long j, Object obj2) {
/* 5 */             Iool0o0iOI iool0o0iOII000O01llI0 = (Iool0o0iOI) Ooil11Oi.I000OiO(j, obj);
/* 11 */            Iool0o0iOI iool0o0iOI = (Iool0o0iOI) Ooil11Oi.I000OiO(j, obj2);
/* 13 */            int size = iool0o0iOII000O01llI0.size();
/* 17 */            int size2 = iool0o0iOI.size();
/* 21 */            if (size > 0 && size2 > 0) {
/* 30 */                if (!((I01Iol) iool0o0iOII000O01llI0).I00iOIl) {
/* 33 */                    iool0o0iOII000O01llI0 = iool0o0iOII000O01llI0.I000O01llI0(size2 + size);
                        }
/* 37 */                iool0o0iOII000O01llI0.addAll(iool0o0iOI);
                    }
/* 40 */            if (size > 0) {
/* 42 */                iool0o0iOI = iool0o0iOII000O01llI0;
                    }
/* 43 */            Ooil11Oi.I00100o1O0lo(obj, j, iool0o0iOI);
                }

                @Override
                public final List I0000Il00O(long j, Object obj) {
/* 5 */             Iool0o0iOI iool0o0iOI = (Iool0o0iOI) Ooil11Oi.I000OiO(j, obj);
/* 12 */            if (((I01Iol) iool0o0iOI).I00iOIl) {
/* 89 */                return iool0o0iOI;
                    }
/* 14 */            int size = iool0o0iOI.size();
/* 25 */            Iool0o0iOI iool0o0iOII000O01llI0 = iool0o0iOI.I000O01llI0(size == 0 ? 10 : size * 2);
/* 29 */            Ooil11Oi.I00100o1O0lo(obj, j, iool0o0iOII000O01llI0);
/* 89 */            return iool0o0iOII000O01llI0;
                }
            }
