            package p000;

            import android.content.res.Resources;
            import com.box.gallery.R;
            import java.util.Collection;
            import java.util.List;
            
            public abstract class iOIl0OoO {
                public static final boolean I00000oIO(Oil000 oil000) {
/* 1 */             OiioiIIlooo oiioiIIloooI000iOII = oil000.I000iOII();
/* 13 */            return !oiioiIIloooI000iOII.I00iOIl.I0000Il00O(Oil0I1O.I000OiO);
                }

                public static final boolean I00000oOI(Oil000 oil000) {
/* 7 */             Object objI000II = oil000.I0000O.I00iOIl.I000II(Oil0I1O.I00Io1o110i);
/* 12 */            if (objI000II == null) {
/* 14 */                objI000II = null;
                    }
/* 15 */            Oo1IiOO1IoI oo1IiOO1IoI = (Oo1IiOO1IoI) objI000II;
/* 19 */            OI10I1IoI0Ol oI10I1IoI0Ol = oil000.I0000O.I00iOIl;
/* 23 */            Object objI000II2 = oI10I1IoI0Ol.I000II(Oil0I1O.I001l0I00);
/* 27 */            if (objI000II2 == null) {
/* 29 */                objI000II2 = null;
                    }
/* 30 */            Oi1o00lo oi1o00lo = (Oi1o00lo) objI000II2;
/* 37 */            boolean z = oo1IiOO1IoI != null;
/* 40 */            Object objI000II3 = oI10I1IoI0Ol.I000II(Oil0I1O.I00Io1lO);
/* 50 */            if (((Boolean) (objI000II3 != null ? objI000II3 : null)) == null || (oi1o00lo != null && oi1o00lo.I00000oIO == 4)) {
/* 77 */                return z;
                    }
/* 32 */            return true;
                }

                public static final String I0000Il00O(Oil000 oil000, Resources resources) throws Resources.NotFoundException {
/* 1 */             OiioiIIlooo oiioiIIlooo = oil000.I0000O;
/* 3 */             OiioiIIlooo oiioiIIlooo2 = oil000.I0000O;
/* 9 */             Object objI000II = oiioiIIlooo.I00iOIl.I000II(Oil0I1O.I00000oOI);
/* 13 */            String string = null;
/* 14 */            if (objI000II == null) {
/* 16 */                objI000II = null;
                    }
/* 17 */            OI10I1IoI0Ol oI10I1IoI0Ol = oiioiIIlooo2.I00iOIl;
/* 21 */            Object objI000II2 = oI10I1IoI0Ol.I000II(Oil0I1O.I00Io1o110i);
/* 25 */            if (objI000II2 == null) {
/* 27 */                objI000II2 = null;
                    }
/* 28 */            Oo1IiOO1IoI oo1IiOO1IoI = (Oo1IiOO1IoI) objI000II2;
/* 32 */            Object objI000II3 = oI10I1IoI0Ol.I000II(Oil0I1O.I001l0I00);
/* 36 */            if (objI000II3 == null) {
/* 38 */                objI000II3 = null;
                    }
/* 39 */            Oi1o00lo oi1o00lo = (Oi1o00lo) objI000II3;
/* 42 */            if (oo1IiOO1IoI != null) {
/* 44 */                int iOrdinal = oo1IiOO1IoI.ordinal();
/* 49 */                if (iOrdinal != 0) {
/* 51 */                    if (iOrdinal != 1) {
/* 53 */                        if (iOrdinal != 2) {
/* 65 */                            I000II.I00000oIO();
/* 13 */                            return null;
                                }
/* 55 */                        if (objI000II == null) {
/* 60 */                            objI000II = resources.getString(R.string.indeterminate);
                                }
                            } else if (oi1o00lo != null && oi1o00lo.I00000oIO == 2 && objI000II == null) {
/* 81 */                        objI000II = resources.getString(R.string.state_off);
                            }
                        } else if (oi1o00lo != null && oi1o00lo.I00000oIO == 2 && objI000II == null) {
/* 98 */                    objI000II = resources.getString(R.string.state_on);
                        }
                    }
/* 104 */           Object objI000II4 = oI10I1IoI0Ol.I000II(Oil0I1O.I00Io1lO);
/* 108 */           if (objI000II4 == null) {
/* 110 */               objI000II4 = null;
                    }
/* 111 */           Boolean bool = (Boolean) objI000II4;
/* 113 */           if (bool != null) {
/* 115 */               boolean zBooleanValue = bool.booleanValue();
/* 119 */               if ((oi1o00lo == null || oi1o00lo.I00000oIO != 4) && objI000II == null) {
/* 143 */                   objI000II = zBooleanValue ? resources.getString(R.string.selected) : resources.getString(R.string.not_selected);
                        }
                    }
/* 149 */           Object objI000II5 = oI10I1IoI0Ol.I000II(Oil0I1O.I0000Il00O);
/* 153 */           if (objI000II5 == null) {
/* 155 */               objI000II5 = null;
                    }
/* 156 */           OOO01oo oOO01oo = (OOO01oo) objI000II5;
/* 158 */           if (oOO01oo != null) {
/* 162 */               if (oOO01oo != OOO01oo.I0000O) {
/* 164 */                   if (objI000II == null) {
/* 166 */                       IOO1O00oI iOO1O00oI = oOO01oo.I00000oOI;
/* 168 */                       float f = iOO1O00oI.I00000oOI;
/* 170 */                       float f2 = iOO1O00oI.I00000oIO;
/* 186 */                       float f3 = f - f2 == 0.0f ? 0.0f : (oOO01oo.I00000oIO - f2) / (iOO1O00oI.I00000oOI - f2);
/* 189 */                       if (f3 < 0.0f) {
/* 191 */                           f3 = 0.0f;
                                }
/* 196 */                       if (f3 > 1.0f) {
/* 198 */                           f3 = 1.0f;
                                }
/* 236 */                       objI000II = resources.getString(R.string.template_percent, Integer.valueOf(f3 == 0.0f ? 0 : f3 == 1.0f ? 100 : lIiioliIlo.I0000Il00O(Math.round(f3 * 100.0f), 1, 99)));
                            }
                        } else if (objI000II == null) {
/* 246 */                   objI000II = resources.getString(R.string.in_progress);
                        }
                    }
/* 250 */           Oil0IoooOio oil0IoooOio = Oil0I1O.I00IO1oi11O;
/* 256 */           if (oI10I1IoI0Ol.I0000Il00O(oil0IoooOio)) {
/* 271 */               OI10I1IoI0Ol oI10I1IoI0Ol2 = new Oil000(oil000.I00000oIO, true, oil000.I0000Il00O, oiioiIIlooo2).I000iOII().I00iOIl;
/* 275 */               Object objI000II6 = oI10I1IoI0Ol2.I000II(Oil0I1O.I00000oIO);
/* 279 */               if (objI000II6 == null) {
/* 281 */                   objI000II6 = null;
                        }
/* 282 */               Collection collection = (Collection) objI000II6;
/* 284 */               if (collection == null || collection.isEmpty()) {
/* 294 */                   Object objI000II7 = oI10I1IoI0Ol2.I000II(Oil0I1O.I001lloI);
/* 298 */                   if (objI000II7 == null) {
/* 300 */                       objI000II7 = null;
                            }
/* 301 */                   Collection collection2 = (Collection) objI000II7;
/* 303 */                   if (collection2 == null || collection2.isEmpty()) {
/* 311 */                       Object objI000II8 = oI10I1IoI0Ol2.I000II(oil0IoooOio);
/* 315 */                       if (objI000II8 == null) {
/* 317 */                           objI000II8 = null;
                                }
/* 318 */                       CharSequence charSequence = (CharSequence) objI000II8;
/* 320 */                       if (charSequence == null || charSequence.length() == 0) {
/* 331 */                           string = resources.getString(R.string.state_empty);
                                }
                            }
                        }
/* 335 */               objI000II = string;
                    }
/* 336 */           return (String) objI000II;
                }

                public static final I1111OO10i I0000O(Oil000 oil000) {
/* 7 */             Object objI000II = oil000.I0000O.I00iOIl.I000II(Oil0I1O.I00IO1oi11O);
/* 12 */            if (objI000II == null) {
/* 14 */                objI000II = null;
                    }
/* 15 */            I1111OO10i i1111OO10i = (I1111OO10i) objI000II;
/* 23 */            Object objI000II2 = oil000.I0000O.I00iOIl.I000II(Oil0I1O.I001lloI);
/* 27 */            if (objI000II2 == null) {
/* 29 */                objI000II2 = null;
                    }
/* 30 */            List list = (List) objI000II2;
                    return i1111OO10i == null ? list != null ? (I1111OO10i) IOOi0Ool1i.I00II0Ol1O0l(list) : null : i1111OO10i;
                }

                public static final boolean I0000oI00(Oil000 oil000, Resources resources) {
/* 5 */             if (iO0o00ili.I0000oI00(oil000)) {
/* 66 */                return false;
                    }
/* 8 */             OiioiIIlooo oiioiIIlooo = oil000.I0000O;
/* 12 */            if (oiioiIIlooo.I00iiO) {
/* 64 */                return true;
                    }
/* 19 */            Object objI000II = oiioiIIlooo.I00iOIl.I000II(Oil0I1O.I00000oIO);
/* 24 */            if (objI000II == null) {
/* 26 */                objI000II = null;
                    }
/* 27 */            List list = (List) objI000II;
                    return !((list != null ? (String) IOOi0Ool1i.I00II0Ol1O0l(list) : null) == null && I0000O(oil000) == null && I0000Il00O(oil000, resources) == null && !I00000oOI(oil000)) && I0001Ioi1lo(oil000);
                }

                public static final boolean I0001Ioi1lo(Oil000 oil000) {
/* 6 */             if (!oil000.I000o00OoI0I()) {
/* 18 */                List listI000OOo1O = oil000.I000OOo1O((4 & 1) != 0 ? !oil000.I00000oOI : false, (4 & 2) == 0);
/* 17 */                int size = listI000OOo1O.size();
/* 22 */                for (int i = 0; i < size; i++) {
/* 34 */                    if (lO1OoI1l1.I00000oIO((Oil000) listI000OOo1O.get(i))) {
                            }
                        }
/* 42 */                O0iiOioolIi o0iiOioolIiI001IO000 = oil000.I0000Il00O.I001IO000();
                        while (true) {
/* 47 */                    if (o0iiOioolIiI001IO000 == null) {
/* 65 */                        o0iiOioolIiI001IO000 = null;
                                break;
                            }
/* 49 */                    OiioiIIlooo oiioiIIloooI001i1lo1io = o0iiOioolIiI001IO000.I001i1lo1io();
/* 53 */                    if (oiioiIIloooI001i1lo1io != null && oiioiIIloooI001i1lo1io.I00iiO) {
                                break;
                            }
/* 60 */                    o0iiOioolIiI001IO000 = o0iiOioolIiI001IO000.I001IO000();
                        }
/* 69 */                return !(o0iiOioolIiI001IO000 != null);
                    }
/* 5 */             return false;
                }
            }
