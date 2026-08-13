            package p000;
            
            public abstract class OO1OOOO1l {
                public static final OlO1iIi1ol0 I00000oIO = new OlO1iIi1ol0(new O1olloI0OlO(12));

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00000oIO(O0oIIIiiO1 o0oIIIiiO1, I0iOI0o1i i0iOI0o1i, IOoilo iOoilo) {
                    OO1O1OII1o0 oO1O1OII1o0;
/* 3 */             if (iOoilo instanceof OO1O1OII1o0) {
/* 6 */                 oO1O1OII1o0 = (OO1O1OII1o0) iOoilo;
/* 8 */                 int i = oO1O1OII1o0.I00iiI;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    oO1O1OII1o0.I00iiI = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    oO1O1OII1o0 = new OO1O1OII1o0(iOoilo);
                        }
                    }
/* 25 */            Object obj = oO1O1OII1o0.I00iOIl;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = oO1O1OII1o0.I00iiI;
/* 32 */            if (i2 != 0) {
/* 34 */                if (i2 != 1) {
/* 38 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 41 */                    return;
                        } else {
/* 42 */                    lIoii1l01l0i.I00000oOI(obj);
/* 45 */                    IOOlIIilOl0.I0000Il00O();
/* 48 */                    return;
                        }
                    }
/* 49 */            lIoii1l01l0i.I00000oOI(obj);
/* 56 */            if (!o0oIIIiiO1.I00iOIl.I00lll10) {
/* 93 */                I000II.I000iOII("establishTextInputSession called from an unattached node");
/* 98 */                return;
                    }
/* 58 */            OIlO000O01 oIlO000O01I000OOo1O = il0lI1i1olii.I000OOo1O(o0oIIIiiO1);
/* 68 */            OO0lO0l0 oO0lO0l0 = (OO0lO0l0) il0lI1i1olii.I000O01llI0(o0oIIIiiO1).I00ooiO1I;
/* 70 */            oO0lO0l0.getClass();
/* 79 */            if (iililIiIiO.I00000oIO(oO0lO0l0, I00000oIO) != null) {
/* 87 */                OIiilo1Ool0o.I00000oIO();
                    } else {
/* 81 */                oO1O1OII1o0.I00iiI = 1;
/* 83 */                I00000oOI(oIlO000O01I000OOo1O, i0iOI0o1i, oO1O1OII1o0);
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00000oOI(OIlO000O01 oIlO000O01, IlliIl1l11O illiIl1l11O, IOoilo iOoilo) {
                    OO1OO0iioo1 oO1OO0iioo1;
/* 3 */             if (iOoilo instanceof OO1OO0iioo1) {
/* 6 */                 oO1OO0iioo1 = (OO1OO0iioo1) iOoilo;
/* 8 */                 int i = oO1OO0iioo1.I00iiI;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    oO1OO0iioo1.I00iiI = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    oO1OO0iioo1 = new OO1OO0iioo1(iOoilo);
                        }
                    }
/* 25 */            Object obj = oO1OO0iioo1.I00iOIl;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = oO1OO0iioo1.I00iiI;
/* 32 */            if (i2 == 0) {
/* 59 */                lIoii1l01l0i.I00000oOI(obj);
/* 62 */                oO1OO0iioo1.I00iiI = 1;
/* 66 */                ((I0lio1O01i01) oIlO000O01).I00IioO0OiOi(illiIl1l11O, oO1OO0iioo1);
                    } else if (i2 == 1) {
/* 52 */                lIoii1l01l0i.I00000oOI(obj);
/* 55 */                IOOlIIilOl0.I0000Il00O();
                    } else if (i2 != 2) {
/* 41 */                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
                    } else {
/* 45 */                lIoii1l01l0i.I00000oOI(obj);
/* 48 */                IOOlIIilOl0.I0000Il00O();
                    }
                }
            }
