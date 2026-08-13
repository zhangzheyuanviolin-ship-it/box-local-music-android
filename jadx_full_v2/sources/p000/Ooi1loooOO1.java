            package p000;

            import android.view.View;
            import java.util.ArrayList;
            
            public final class Ooi1loooOO1 implements I1IOO010 {
                public final Object I00iOIl;
                public final ArrayList I00iiI = new ArrayList();
                public Object I00iiO;

                public Ooi1loooOO1(O0iiOioolIi o0iiOioolIi) {
/* 4 */             this.I00iOIl = o0iiOioolIi;
/* 13 */            this.I00iiO = o0iiOioolIi;
                }

                public final void I00000oIO() {
/* 3 */             this.I00iiI.clear();
/* 8 */             this.I00iiO = this.I00iOIl;
/* 14 */            ((O0iiOioolIi) this.I00iOIl).I00OIO1();
                }

                @Override
                public final void I0000Il00O(int i, Object obj) {
/* 7 */             ((O0iiOioolIi) this.I00iiO).I001lloI(i, (O0iiOioolIi) obj);
                }

                @Override
                public final void I0000O(Object obj) {
/* 5 */             this.I00iiI.add(this.I00iiO);
/* 8 */             this.I00iiO = obj;
                }

                @Override
                public final void I0000oI00() {
                    OOo0Olol0o rectManager;
                    I0lII0loi i0lII0loiM26getAutofillManager;
                    OOo0Olol0o rectManager2;
/* 3 */             O0iiOioolIi o0iiOioolIi = (O0iiOioolIi) this.I00iiO;
/* 5 */             IIlOoolol0ll iIlOoolol0ll = o0iiOioolIi.I010101Oo1lO;
/* 11 */            if (!o0iiOioolIi.I00Io1lO()) {
/* 15 */                IolioOO1.I00000oIO("onReuse is only expected on attached node");
                    }
/* 18 */            Oooio0iiI0 oooio0iiI0 = o0iiOioolIi.I00o0l1o1o0;
/* 20 */            if (oooio0iiI0 != null) {
/* 22 */                View view = oooio0iiI0.I00iiI;
/* 28 */                if (view.getParent() != oooio0iiI0) {
/* 30 */                    oooio0iiI0.addView(view);
                        } else {
/* 36 */                    oooio0iiI0.I00ilO0.invoke();
                        }
                    }
/* 39 */            O0io0olo o0io0olo = o0iiOioolIi.I010II;
/* 42 */            if (o0io0olo != null) {
/* 44 */                o0io0olo.I000OOo1O(false);
                    }
/* 47 */            o0iiOioolIi.I00oO101o = false;
/* 51 */            if (o0iiOioolIi.I010o0o0oO) {
/* 53 */                o0iiOioolIi.I010o0o0oO = false;
                    } else {
/* 60 */                O1ooOo o1ooOo = (Olo11IOO) o0iiOioolIi.I010101Oo1lO.I00ilO0;
/* 63 */                for (O1ooOo o1ooOo2 = o1ooOo; o1ooOo2 != null; o1ooOo2 = o1ooOo2.I00ilI0I1) {
/* 67 */                    if (o1ooOo2.I00lll10) {
/* 69 */                        o1ooOo2.I010OIo1l();
                            }
                        }
/* 76 */                for (O1ooOo o1ooOo3 = o1ooOo; o1ooOo3 != null; o1ooOo3 = o1ooOo3.I00ilI0I1) {
/* 80 */                    if (o1ooOo3.I00lll10) {
/* 82 */                        o1ooOo3.I010iIIOlo();
                            }
                        }
/* 88 */                while (o1ooOo != null) {
/* 92 */                    if (o1ooOo.I00lll10) {
/* 94 */                        o1ooOo.I0100o111I();
                            }
/* 97 */                    o1ooOo = o1ooOo.I00ilI0I1;
                        }
                    }
/* 100 */           int i = o0iiOioolIi.I00iiI;
/* 102 */           OIlO000O01 oIlO000O01 = o0iiOioolIi.I00o0iI0io1;
/* 104 */           if (oIlO000O01 != null && (rectManager2 = ((I0lio1O01i01) oIlO000O01).getRectManager()) != null) {
/* 114 */               rectManager2.I000O01llI0(o0iiOioolIi);
                    }
/* 124 */           o0iiOioolIi.I00iiI = OiioloIlOlIi.I00000oIO.addAndGet(1);
/* 126 */           OIlO000O01 oIlO000O012 = o0iiOioolIi.I00o0iI0io1;
/* 128 */           if (oIlO000O012 != null) {
/* 130 */               I0lio1O01i01 i0lio1O01i01 = (I0lio1O01i01) oIlO000O012;
/* 136 */               i0lio1O01i01.getLayoutNodes().I000II(i);
/* 145 */               i0lio1O01i01.getLayoutNodes().I000OOo1O(o0iiOioolIi.I00iiI, o0iiOioolIi);
                    }
/* 152 */           for (O1ooOo o1ooOo4 = (O1ooOo) iIlOoolol0ll.I00io1l; o1ooOo4 != null; o1ooOo4 = o1ooOo4.I00ilO0) {
/* 154 */               o1ooOo4.I0100i();
                    }
/* 160 */           iIlOoolol0ll.I000oI1ioi();
/* 169 */           if (iIlOoolol0ll.I000iOII(8)) {
/* 171 */               o0iiOioolIi.I00IioO0OiOi();
                    }
/* 174 */           O0iiOioolIi.I00Ol10(o0iiOioolIi);
/* 177 */           OIlO000O01 oIlO000O013 = o0iiOioolIi.I00o0iI0io1;
/* 179 */           if (oIlO000O013 != null && (i0lII0loiM26getAutofillManager = ((I0lio1O01i01) oIlO000O013).m26getAutofillManager()) != null) {
/* 189 */               I0lio1O01i01 i0lio1O01i012 = i0lII0loiM26getAutofillManager.I00iiO;
/* 191 */               IIlio101Io iIlio101Io = i0lII0loiM26getAutofillManager.I00iOIl;
/* 193 */               OI0lOIOi1l oI0lOIOi1l = i0lII0loiM26getAutofillManager.I00ioIO;
/* 199 */               if (oI0lOIOi1l.I0001Ioi1lo(i)) {
/* 201 */                   iIlio101Io.I00olI(i0lio1O01i012, i, false);
                        }
/* 204 */               OiioiIIlooo oiioiIIloooI001i1lo1io = o0iiOioolIi.I001i1lo1io();
/* 208 */               if (oiioiIIloooI001i1lo1io != null && oiioiIIloooI001i1lo1io.I00iOIl.I00000oOI(Oil0I1O.I0010I0i)) {
/* 222 */                   oI0lOIOi1l.I00000oIO(o0iiOioolIi.I00iiI);
/* 227 */                   iIlio101Io.I00olI(i0lio1O01i012, o0iiOioolIi.I00iiI, true);
                        }
                    }
/* 230 */           OIlO000O01 oIlO000O014 = o0iiOioolIi.I00o0iI0io1;
/* 232 */           if (oIlO000O014 == null || (rectManager = ((I0lio1O01i01) oIlO000O014).getRectManager()) == null) {
/* 245 */               return;
                    }
/* 242 */           rectManager.I000II(o0iiOioolIi);
                }

                @Override
                public final void I0001Ioi1lo(int i, int i2, int i3) {
/* 5 */             ((O0iiOioolIi) this.I00iiO).I00IoiI(i, i2, i3);
                }

                @Override
                public final void I000II(int i, int i2) {
/* 5 */             ((O0iiOioolIi) this.I00iiO).I00OIl(i, i2);
                }

                @Override
                public final void I000OOo1O() {
/* 8 */             this.I00iiO = IIlIOloOOO.I000o00OoI0I(1, this.I00iiI);
                }

                @Override
                public final void I000OiO(int i, Object obj) {
                }

                @Override
                public final void I000iOII() {
/* 5 */             OIlO000O01 oIlO000O01 = ((O0iiOioolIi) this.I00iOIl).I00o0iI0io1;
/* 7 */             if (oIlO000O01 != null) {
/* 11 */                ((I0lio1O01i01) oIlO000O01).I001IIilI0O();
                    }
                }

                @Override
                public final Object I000l1() {
/* 1 */             return this.I00iiO;
                }
            }
