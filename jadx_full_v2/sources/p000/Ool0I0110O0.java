            package p000;
            
            public final class Ool0I0110O0 implements Ii00ilI1 {
                public Ool0I0110O0 I00iOIl;
                public Ii1OIIlOi I00iiI;

                public final void I00000oIO(Ii1OIIlOi ii1OIIlOi) {
/* 3 */             if (this.I00iiI == ii1OIIlOi) {
/* 15 */                I000II.I001IO000("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
/* 29 */                return;
                    }
/* 5 */             Ool0I0110O0 ool0I0110O0 = this.I00iOIl;
/* 7 */             if (ool0I0110O0 != null) {
/* 9 */                 ool0I0110O0.I00000oIO(ii1OIIlOi);
                    }
                }

                @Override
                public final Object I00IoiI(IlliIl1l11O illiIl1l11O, Object obj) {
/* 1 */             return illiIl1l11O.invoke(obj, this);
                }

                @Override
                public final Ii00l101O I00OIl(Ii00l0i1loO ii00l0i1loO) {
/* 1 */             return iioloI1O1i.I00000oOI(this, ii00l0i1loO);
                }

                @Override
                public final Ii00l101O I00ioIO(Ii00l101O ii00l101O) {
/* 1 */             return iiollilo0IO1.I00000oIO(this, ii00l101O);
                }

                @Override
                public final Ii00ilI1 I00lli11(Ii00l0i1loO ii00l0i1loO) {
/* 1 */             return iioloI1O1i.I00000oIO(this, ii00l0i1loO);
                }

                @Override
                public final Ii00l0i1loO getKey() {
/* 1 */             return loIOiIO1O1.I00li1OI;
                }
            }
