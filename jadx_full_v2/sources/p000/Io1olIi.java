            package p000;

            import java.util.ArrayList;
            import java.util.List;
            
            public final class Io1olIi implements IllOOo00lI {
                public final int I00iOIl;
                public OloIl1l1oOii I00iiI;

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v0, types: [Il01100l] */
                /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList] */
                /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
                @Override
                public final Object invoke() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object arrayList = Il01100l.I00iOIl;
/* 7 */             OloIl1l1oOii oloIl1l1oOii = this.I00iiI;
                    switch (i) {
                        case 0:
/* 186 */                   return Integer.valueOf(((Number) oloIl1l1oOii.I0010o.getValue()).longValue() >= 0 ? oloIl1l1oOii.I000OiO.size() : 0);
                        case 1:
/* 121 */                   if (((Number) oloIl1l1oOii.I0010o.getValue()).longValue() >= 0) {
/* 125 */                       List listI00iIi0i1o = IOOi0Ool1i.I00iIi0i1o(oloIl1l1oOii.I000OiO);
/* 133 */                       arrayList = new ArrayList();
/* 144 */                       for (Object obj : listI00iIi0i1o) {
/* 155 */                           if (!((O1oIOiI11o0) obj).I00IOO) {
/* 157 */                               arrayList.add(obj);
                                    }
                                }
                            }
/* 161 */                   return arrayList;
                        case 2:
/* 66 */                    if (((Number) oloIl1l1oOii.I0010o.getValue()).longValue() >= 0) {
/* 70 */                        List listI00iIi0i1o2 = IOOi0Ool1i.I00iIi0i1o(oloIl1l1oOii.I000OiO);
/* 78 */                        arrayList = new ArrayList();
/* 89 */                        for (Object obj2 : listI00iIi0i1o2) {
/* 100 */                           if (((O1oIOiI11o0) obj2).I00IOO) {
/* 102 */                               arrayList.add(obj2);
                                    }
                                }
                            }
/* 106 */                   return arrayList;
                        case 3:
/* 47 */                    return Integer.valueOf(((Number) oloIl1l1oOii.I0010o.getValue()).longValue() >= 0 ? oloIl1l1oOii.I000OiO.size() : -1);
                        default:
/* 18 */                    return Integer.valueOf(oloIl1l1oOii.I000OiO.size());
                    }
                }
            }
