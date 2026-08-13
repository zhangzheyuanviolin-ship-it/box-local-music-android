            package p000;
            
            public final class OoiI00ill extends Ii00lIOoi {
                public static final OoiI00ill I00iiI = new OoiI00ill();

                @Override
                public final void I00iOIl(Ii00l101O ii00l101O, Runnable runnable) {
/* 7 */             i01oio0l0o i01oio0l0oVar = (i01oio0l0o) ii00l101O.I00lli11(i01oio0l0o.I00iiO);
/* 9 */             if (i01oio0l0oVar != null) {
/* 12 */                i01oio0l0oVar.I00iiI = true;
                    } else {
/* 17 */                OoOil11Ol1o.I000OiO("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
                    }
                }

                @Override
                public final String toString() {
/* 1 */             return "Dispatchers.Unconfined";
                }
            }
