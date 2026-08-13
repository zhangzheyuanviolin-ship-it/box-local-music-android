            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class IIIOiol extends OIo0l0 implements OIo0il {
                public IIIOOI0O10I I00io1l;
                public OI1Ili10l0i I00ioIO;
                public OillOo0 I00l0I0l0lO1;
                public OOOloll11 I00l0OO0IO;
                public IiOo1o0 I00li1OI;

                @Override
                public final O1iil1I01o I00IoiI() {
/* 1 */             IiOo1o0 iiOo1o0 = this.I00li1OI;
/* 3 */             if (iiOo1o0 != null) {
/* 5 */                 return iiOo1o0;
                    }
/* 8 */             O0000Ioio00.I000OOo1O("_memberScope");
/* 29 */            throw null;
                }

                public final void I010ioo(Ii10lIo0l1 ii10lIo0l1) {
/* 1 */             OOOloll11 oOOloll11 = this.I00l0OO0IO;
/* 3 */             if (oOOloll11 == null) {
/* 53 */                I000II.I001IO000("Repeated call to DeserializedPackageFragmentImpl::initialize");
/* 186 */               return;
                    }
/* 6 */             this.I00l0OO0IO = null;
/* 34 */            I01iiIii10O i01iiIii10O = new I01iiIii10O(18);
/* 37 */            i01iiIii10O.I00iiI = this;
/* 39 */            VarHandle.storeStoreFence();
/* 48 */            this.I00li1OI = new IiOo1o0(this, oOOloll11.I00ilO0, this.I00ioIO, this.I00io1l, null, ii10lIo0l1, "scope of " + this, i01iiIii10O);
                }

                @Override
                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("builtins package fragment for ");
/* 10 */            sb.append(this.I00ilI0I1);
/* 15 */            sb.append(" from ");
/* 18 */            int i = IiOiOOIo.I00000oIO;
/* 24 */            sb.append(IiOiIO0i1Oil.I0000Il00O(this));
/* 27 */            return sb.toString();
                }
            }
