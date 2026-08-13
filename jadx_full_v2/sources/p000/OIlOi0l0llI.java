            package p000;

            import java.util.ArrayList;
            
            public class OIlOi0l0llI extends OIllo101O {
                public OIlOi0l0llI(IIOoi0ooOoO iIOoi0ooOoO) {
/* 3 */             super(IIi0I0I0o.I00ll1, iIOoi0ooOoO);
                }

                /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                private boolean I00100l0(String str) {
                    String str2;
/* 11 */            IIOoIilO iIOoIilO = (IIOoIilO) I000iOII().I00oII(IIi0I0I0o.I00oI0i);
/* 14 */            if (iIOoIilO != null) {
/* 16 */                ArrayList arrayList = iIOoIilO.I00iOIl;
/* 23 */                for (int i = 0; i < arrayList.size(); i++) {
/* 29 */                    if (i < arrayList.size()) {
/* 31 */                        Object obj = arrayList.get(i);
/* 44 */                        str2 = obj instanceof IIi0I0I0o ? ((IIi0I0I0o) obj).I00iOIl : null;
                            }
/* 49 */                    if (str.equals(str2)) {
/* 51 */                        return true;
                            }
                        }
                    }
/* 13 */            return false;
                }

                public OIloOoil011l I000lI() {
/* 11 */            IIOoIilO iIOoIilO = (IIOoIilO) I000iOII().I00oII(IIi0I0I0o.I00olI);
/* 13 */            if (iIOoIilO != null) {
/* 17 */                return new OIloOoil011l(iIOoIilO);
                    }
/* 21 */            return null;
                }

                public String I000o00OoI0I() {
/* 7 */             return I000iOII().I010101Oo1lO(IIi0I0I0o.I0Ii0oI1);
                }

                public String I000oI1ioi() {
/* 7 */             return I000iOII().I010101Oo1lO(IIi0I0I0o.I0IilI00l);
                }

                public boolean I00100o1O0lo() {
/* 3 */             return I00100l0("Bottom");
                }

                public boolean I0010I0i() {
/* 3 */             return I00100l0("Left");
                }

                public boolean I0010o() {
/* 3 */             return I00100l0("Right");
                }

                public boolean I00111O() {
/* 3 */             return I00100l0("Top");
                }
            }
