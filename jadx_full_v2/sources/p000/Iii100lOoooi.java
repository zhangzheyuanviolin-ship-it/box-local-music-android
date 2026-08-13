            package p000;

            import java.util.HashMap;
            
            public final class Iii100lOoooi extends Il0IIl0OOI {
                public IIOoi0ooOoO I00iiO;
                public Il0IIl0OOI I00iio;
                public HashMap I00ilI0I1;

                public final void I0000O() {
                    Integer num;
/* 5 */             IIOoOiOI iIOoOiOII00oII = this.I00iiO.I00oII(IIi0I0I0o.I01Ilo0i);
/* 11 */            if (iIOoOiOII00oII instanceof IIOoIilO) {
/* 14 */                IIOoIilO iIOoIilO = (IIOoIilO) iIOoOiOII00oII;
/* 16 */                int iI00lli11 = -1;
/* 24 */                for (int i = 0; i < iIOoIilO.I00iOIl.size(); i++) {
/* 26 */                    IIOoOiOI iIOoOiOII00lll10 = iIOoIilO.I00lll10(i);
/* 32 */                    if (iIOoOiOII00lll10 instanceof IIi0IoOo) {
/* 36 */                        iI00lli11 = ((IIi0IoOo) iIOoOiOII00lll10).I00lli11();
                            } else if (iIOoOiOII00lll10 instanceof IIi0I0I0o) {
/* 47 */                        String str = ((IIi0I0I0o) iIOoOiOII00lll10).I00iOIl;
/* 49 */                        Integer numValueOf = Integer.valueOf(iI00lli11);
/* 53 */                        HashMap map = this.I00iOIl;
/* 59 */                        String str2 = (String) map.get(numValueOf);
/* 61 */                        HashMap map2 = this.I00iiI;
/* 63 */                        if (str2 != null && (num = (Integer) map2.get(str2)) != null && num.intValue() == iI00lli11) {
/* 79 */                            map2.remove(str2);
                                }
/* 86 */                        map2.put(str, Integer.valueOf(iI00lli11));
/* 93 */                        map.put(Integer.valueOf(iI00lli11), str);
/* 102 */                       this.I00ilI0I1.put(Integer.valueOf(iI00lli11), str);
/* 105 */                       iI00lli11++;
                            }
                        }
                    }
                }

                @Override
                public final IIOoOiOI I00Io1lO() {
/* 1 */             return this.I00iiO;
                }
            }
