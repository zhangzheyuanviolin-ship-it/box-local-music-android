            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class OiOlI0ol1 extends IiIioO0ol1oI implements IOlIil1, OIOilOIi1 {
                public OiOoi0I0o0i I00o101lO;
                public OIilII I00oI0i;
                public boolean I00oII;
                public IlOIll0o11Ii I00oIiI10;
                public OI0lOIiOIOOo I00oO101o;
                public III0liIO I00oOio10iI1;
                public boolean I00ol1;
                public I0o1iIoolIi I00olI;
                public OiOoIO1 I00oli;
                public IiIill0O0li1 I00oliIiO01i;
                public I0o1iOo1i I00oo1iO0ll;
                public I0o1iIoolIi I00ooIo0;
                public boolean I00ooiO1I;

                @Override
                public final void I00OI1() {
/* 1 */             boolean zI010oio1OO0 = I010oio1OO0();
/* 7 */             if (this.I00ooiO1I != zI010oio1OO0) {
/* 9 */                 this.I00ooiO1I = zI010oio1OO0;
/* 11 */                OiOoi0I0o0i oiOoi0I0o0i = this.I00o101lO;
/* 13 */                OIilII oIilII = this.I00oI0i;
/* 15 */                boolean z = this.I00ol1;
/* 23 */                I0o1iIoolIi i0o1iIoolIi = z ? this.I00ooIo0 : this.I00olI;
/* 35 */                I01101IOlO(i0o1iIoolIi, this.I00oOio10iI1, this.I00oIiI10, this.I00oO101o, oIilII, oiOoi0I0o0i, z, this.I00oII);
                    }
                }

                @Override
                public final void I00ilO0() {
/* 7 */             I0o1iOo1i i0o1iOo1i = (I0o1iOo1i) iiliIooIliOo.I00000oIO(this, OIlIo0OII1.I00000oIO);
/* 15 */            if (O0000Ioio00.I0000O(i0o1iOo1i, this.I00oo1iO0ll)) {
/* 110 */               return;
                    }
/* 17 */            this.I00oo1iO0ll = i0o1iOo1i;
/* 20 */            this.I00ooIo0 = null;
/* 22 */            IiIill0O0li1 iiIill0O0li1 = this.I00oliIiO01i;
/* 24 */            if (iiIill0O0li1 != null) {
/* 26 */                I010l1ol111(iiIill0O0li1);
                    }
/* 29 */            this.I00oliIiO01i = null;
/* 31 */            I010o0o0oO();
/* 34 */            OiOoIO1 oiOoIO1 = this.I00oli;
/* 36 */            if (oiOoIO1 != null) {
/* 38 */                OiOoi0I0o0i oiOoi0I0o0i = this.I00o101lO;
/* 40 */                OIilII oIilII = this.I00oI0i;
/* 50 */                I0o1iIoolIi i0o1iIoolIi = this.I00ol1 ? this.I00ooIo0 : this.I00olI;
/* 63 */                oiOoIO1.I011lOIoo0l(i0o1iIoolIi, this.I00oOio10iI1, this.I00oIiI10, this.I00oO101o, oIilII, oiOoi0I0o0i, this.I00oII, this.I00ooiO1I);
                    }
                }

                @Override
                public final boolean I00oooO() {
/* 1 */             return false;
                }

                @Override
                public final void I010101Oo1lO() {
/* 5 */             this.I00ooiO1I = I010oio1OO0();
/* 7 */             I010o0o0oO();
/* 12 */            if (this.I00oli == null) {
/* 16 */                OiOoi0I0o0i oiOoi0I0o0i = this.I00o101lO;
/* 26 */                I0o1iIoolIi i0o1iIoolIi = this.I00ol1 ? this.I00ooIo0 : this.I00olI;
/* 41 */                OiOoIO1 oiOoIO1 = new OiOoIO1(i0o1iIoolIi, this.I00oOio10iI1, this.I00oIiI10, this.I00oO101o, this.I00oI0i, oiOoi0I0o0i, this.I00oII, this.I00ooiO1I);
/* 44 */                I010l1O(oiOoIO1);
/* 47 */                this.I00oli = oiOoIO1;
                    }
                }

                @Override
                public final void I010I0() {
/* 1 */             IiIill0O0li1 iiIill0O0li1 = this.I00oliIiO01i;
/* 3 */             if (iiIill0O0li1 != null) {
/* 5 */                 I010l1ol111(iiIill0O0li1);
                    }
                }

                public final void I010o0o0oO() {
/* 1 */             IiIill0O0li1 iiIill0O0li1 = this.I00oliIiO01i;
/* 3 */             if (iiIill0O0li1 != null) {
/* 56 */                if (((O1ooOo) iiIill0O0li1).I00iOIl.I00lll10) {
/* 110 */                   return;
                        }
/* 58 */                I010l1O(iiIill0O0li1);
/* 110 */               return;
                    }
/* 7 */             if (this.I00ol1) {
/* 13 */                OIOo1iiI oIOo1iiI = new OIOo1iiI(22);
/* 16 */                oIOo1iiI.I00iiI = this;
/* 18 */                VarHandle.storeStoreFence();
/* 21 */                l1ioloOOl00l.I00000oIO(this, oIOo1iiI);
                    }
/* 31 */            I0o1iIoolIi i0o1iIoolIi = this.I00ol1 ? this.I00ooIo0 : this.I00olI;
/* 33 */            if (i0o1iIoolIi != null) {
/* 35 */                OlOl100 olOl100 = i0o1iIoolIi.I000OOo1O;
/* 41 */                if (olOl100.I00iOIl.I00lll10) {
/* 110 */                   return;
                        }
/* 43 */                I010l1O(olOl100);
/* 46 */                this.I00oliIiO01i = olOl100;
                    }
                }

                public final boolean I010oio1OO0() {
/* 1 */             O0iOOoiioO o0iOOoiioO = O0iOOoiioO.I00iOIl;
/* 5 */             if (this.I00lll10) {
/* 11 */                o0iOOoiioO = il0lI1i1olii.I000O01llI0(this).I00oo1iO0ll;
                    }
                    return o0iOOoiioO != O0iOOoiioO.I00iiI || this.I00oI0i == OIilII.I00iOIl;
                }

                public final void I01101IOlO(I0o1iIoolIi i0o1iIoolIi, III0liIO iII0liIO, IlOIll0o11Ii ilOIll0o11Ii, OI0lOIiOIOOo oI0lOIiOIOOo, OIilII oIilII, OiOoi0I0o0i oiOoi0I0o0i, boolean z, boolean z2) {
                    boolean z3;
/* 3 */             this.I00o101lO = oiOoi0I0o0i;
/* 5 */             this.I00oI0i = oIilII;
/* 9 */             boolean z4 = true;
/* 11 */            if (this.I00ol1 != z) {
/* 13 */                this.I00ol1 = z;
/* 15 */                z3 = true;
                    } else {
/* 17 */                z3 = false;
                    }
/* 24 */            if (O0000Ioio00.I0000O(this.I00olI, i0o1iIoolIi)) {
/* 29 */                z4 = false;
                    } else {
/* 26 */                this.I00olI = i0o1iIoolIi;
                    }
/* 30 */            if (z3 || (z4 && !z)) {
/* 40 */                IiIill0O0li1 iiIill0O0li1 = this.I00oliIiO01i;
/* 42 */                if (iiIill0O0li1 != null) {
/* 44 */                    I010l1ol111(iiIill0O0li1);
                        }
/* 48 */                this.I00oliIiO01i = null;
/* 50 */                I010o0o0oO();
                    }
/* 54 */            this.I00oII = z2;
/* 56 */            this.I00oIiI10 = ilOIll0o11Ii;
/* 58 */            this.I00oO101o = oI0lOIiOIOOo;
/* 60 */            this.I00oOio10iI1 = iII0liIO;
/* 62 */            boolean zI010oio1OO0 = I010oio1OO0();
/* 66 */            this.I00ooiO1I = zI010oio1OO0;
/* 68 */            OiOoIO1 oiOoIO1 = this.I00oli;
/* 70 */            if (oiOoIO1 != null) {
/* 88 */                oiOoIO1.I011lOIoo0l(this.I00ol1 ? this.I00ooIo0 : this.I00olI, iII0liIO, ilOIll0o11Ii, oI0lOIiOIOOo, oIilII, oiOoi0I0o0i, z2, zI010oio1OO0);
                    }
                }
            }
