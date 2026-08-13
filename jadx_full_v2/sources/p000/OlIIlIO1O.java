            package p000;

            import android.view.View;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.Objects;
            
            public final class OlIIlIO1O {
                public int I00000oIO;
                public int I00000oOI;
                public final Ill0l1 I0000Il00O;
                public final ArrayList I0000O = new ArrayList();
                public final HashSet I0000oI00 = new HashSet();
                public boolean I0001Ioi1lo = false;
                public boolean I000II = false;
                public IllI0O1ol1lo I000O01llI0;

                public OlIIlIO1O(int i, int i2, Ill0l1 ill0l1, IIoi1Oi iIoi1Oi) {
/* 23 */            this.I00000oIO = i;
/* 25 */            this.I00000oOI = i2;
/* 27 */            this.I0000Il00O = ill0l1;
/* 33 */            Oi1ol0llI oi1ol0llI = new Oi1ol0llI(16, false);
/* 36 */            oi1ol0llI.I00iiI = this;
/* 38 */            VarHandle.storeStoreFence();
/* 41 */            iIoi1Oi.I00000oOI(oi1ol0llI);
                }

                public final void I00000oIO() {
/* 3 */             if (this.I0001Ioi1lo) {
/* 55 */                return;
                    }
/* 7 */             this.I0001Ioi1lo = true;
/* 9 */             HashSet hashSet = this.I0000oI00;
/* 15 */            if (hashSet.isEmpty()) {
/* 17 */                I00000oOI();
/* 20 */                return;
                    }
/* 26 */            Iterator it = new ArrayList(hashSet).iterator();
/* 34 */            while (it.hasNext()) {
/* 42 */                ((IIoi1Oi) it.next()).I00000oIO();
                    }
                }

                public final void I00000oOI() {
/* 3 */             if (!this.I000II) {
/* 11 */                if (Ill1OlOOl.I00IOO(2)) {
/* 13 */                    toString();
                        }
/* 17 */                this.I000II = true;
/* 21 */                Iterator it = this.I0000O.iterator();
/* 29 */                while (it.hasNext()) {
/* 37 */                    ((Runnable) it.next()).run();
                        }
                    }
/* 43 */            this.I000O01llI0.I000iOII();
                }

                public final void I0000Il00O(int i, int i2) {
/* 1 */             int iI001lIiIIo1O = IIlIOloOOO.I001lIiIIo1O(i2);
/* 5 */             Ill0l1 ill0l1 = this.I0000Il00O;
/* 9 */             if (iI001lIiIIo1O == 0) {
/* 51 */                if (this.I00000oIO != 1) {
/* 57 */                    if (Ill1OlOOl.I00IOO(2)) {
/* 59 */                        Objects.toString(ill0l1);
                            }
/* 62 */                    this.I00000oIO = i;
/* 106 */                   return;
                        }
/* 106 */               return;
                    }
/* 11 */            if (iI001lIiIIo1O != 1) {
/* 13 */                if (iI001lIiIIo1O != 2) {
/* 106 */                   return;
                        }
/* 20 */                if (Ill1OlOOl.I00IOO(2)) {
/* 22 */                    Objects.toString(ill0l1);
                        }
/* 25 */                this.I00000oIO = 1;
/* 28 */                this.I00000oOI = 3;
/* 30 */                return;
                    }
/* 33 */            if (this.I00000oIO == 1) {
/* 39 */                if (Ill1OlOOl.I00IOO(2)) {
/* 41 */                    Objects.toString(ill0l1);
                        }
/* 44 */                this.I00000oIO = 2;
/* 46 */                this.I00000oOI = 2;
                    }
                }

                public final void I0000O() {
/* 1 */             IllI0O1ol1lo illI0O1ol1lo = this.I000O01llI0;
/* 3 */             int i = this.I00000oOI;
/* 6 */             if (i != 2) {
/* 87 */                if (i == 3) {
/* 89 */                    Ill0l1 ill0l1 = illI0O1ol1lo.I0000Il00O;
/* 91 */                    View viewI00IlilI0i0i = ill0l1.I00IlilI0i0i();
/* 99 */                    if (Ill1OlOOl.I00IOO(2)) {
/* 105 */                       Objects.toString(viewI00IlilI0i0i.findFocus());
/* 108 */                       viewI00IlilI0i0i.toString();
/* 111 */                       ill0l1.toString();
                            }
/* 114 */                   viewI00IlilI0i0i.clearFocus();
/* 245 */                   return;
                        }
/* 245 */               return;
                    }
/* 8 */             Ill0l1 ill0l12 = illI0O1ol1lo.I0000Il00O;
/* 12 */            View viewFindFocus = ill0l12.I0100i.findFocus();
/* 16 */            if (viewFindFocus != null) {
/* 22 */                ill0l12.I0000Il00O().I000iOII = viewFindFocus;
/* 28 */                if (Ill1OlOOl.I00IOO(2)) {
/* 30 */                    viewFindFocus.toString();
/* 33 */                    ill0l12.toString();
                        }
                    }
/* 38 */            View viewI00IlilI0i0i2 = this.I0000Il00O.I00IlilI0i0i();
/* 47 */            if (viewI00IlilI0i0i2.getParent() == null) {
/* 49 */                illI0O1ol1lo.I00000oOI();
/* 52 */                viewI00IlilI0i0i2.setAlpha(0.0f);
                    }
/* 61 */            if (viewI00IlilI0i0i2.getAlpha() == 0.0f && viewI00IlilI0i0i2.getVisibility() == 0) {
/* 70 */                viewI00IlilI0i0i2.setVisibility(4);
                    }
/* 73 */            Ill0iooiIo ill0iooiIo = ill0l12.I010I0;
/* 82 */            viewI00IlilI0i0i2.setAlpha(ill0iooiIo == null ? 1.0f : ill0iooiIo.I000OiO);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("Operation {");
/* 16 */            sb.append(Integer.toHexString(System.identityHashCode(this)));
/* 21 */            sb.append("} {mFinalState = ");
/* 24 */            int i = this.I00000oIO;
/* 26 */            String str = "null";
/* 53 */            sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "INVISIBLE" : "GONE" : "VISIBLE" : "REMOVED");
/* 58 */            sb.append("} {mLifecycleImpact = ");
/* 61 */            int i2 = this.I00000oOI;
/* 63 */            if (i2 == 1) {
/* 76 */                str = "NONE";
                    } else if (i2 == 2) {
/* 73 */                str = "ADDING";
                    } else if (i2 == 3) {
/* 70 */                str = "REMOVING";
                    }
/* 78 */            sb.append(str);
/* 83 */            sb.append("} {mFragment = ");
/* 88 */            sb.append(this.I0000Il00O);
/* 93 */            sb.append("}");
/* 96 */            return sb.toString();
                }
            }
