            package p000;

            import android.view.ContextThemeWrapper;
            import android.view.View;
            import android.view.Window;
            import com.box.gallery.R;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.UUID;
            import kotlin.jvm.functions.Function1;
            
            public abstract class l1Oloi1o {
                public static final void I00000oIO(IllOOo00lI illOOo00lI, long j, O1oI0oOoi o1oI0oOoi, IOii1l iOii1l, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
                    O0iOOoiioO o0iOOoiioO;
                    boolean z;
/* 16 */            iloI0lOlll1.I00i0O(-85756322);
/* 21 */            if ((i & 6) == 0) {
/* 32 */                i2 = (iloI0lOlll1.I000OOo1O(illOOo00lI) ? 4 : 2) | i;
                    } else {
/* 34 */                i2 = i;
                    }
/* 37 */            if ((i & 48) == 0) {
/* 50 */                i2 |= iloI0lOlll1.I0001Ioi1lo(j) ? 32 : 16;
                    }
/* 53 */            if ((i & 384) == 0) {
/* 66 */                i2 |= iloI0lOlll1.I000II(o1oI0oOoi) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                    }
/* 69 */            if ((i & 3072) == 0) {
/* 82 */                i2 |= iloI0lOlll1.I000OOo1O(iOii1l) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E;
                    }
/* 99 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 1171) != 1170)) {
/* 101 */               iloI0lOlll1.I00Ol00();
/* 106 */               if ((i & 1) != 0 && !iloI0lOlll1.I001lloI()) {
/* 115 */                   iloI0lOlll1.I00OilO00Il();
                        }
/* 118 */               iloI0lOlll1.I0010o();
/* 127 */               View view = (View) iloI0lOlll1.I000iOII(I0lloOI0oio.I0001Ioi1lo);
/* 135 */               IiIooOOOI iiIooOOOI = (IiIooOOOI) iloI0lOlll1.I000iOII(IOlO0o100i1i.I000O01llI0);
/* 145 */               O0iOOoiioO o0iOOoiioO2 = (O0iOOoiioO) iloI0lOlll1.I000iOII(IOlO0o100i1i.I000o00OoI0I);
/* 147 */               Ilo1oli ilo1oliI0000Il00O = iilI1O0il0.I0000Il00O(iloI0lOlll1);
/* 151 */               OI10i0Il oI10i0IlI00000oOI = lOO00IiI0li.I00000oOI(iOii1l, iloI0lOlll1);
/* 155 */               Object[] objArr = new Object[0];
/* 157 */               Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 161 */               Object obj = IOl11li.I00000oIO;
/* 163 */               if (objI00O0i0ii == obj) {
/* 169 */                   objI00O0i0ii = new O0o0Ol0(26);
/* 172 */                   iloI0lOlll1.I00iio(objI00O0i0ii);
                        }
/* 181 */               UUID uuid = (UUID) lIo1lO.I00000oOI(objArr, (IllOOo00lI) objI00O0i0ii, iloI0lOlll1);
/* 191 */               boolean zI000II = iloI0lOlll1.I000II(view) | iloI0lOlll1.I000II(iiIooOOOI);
/* 192 */               Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
/* 196 */               if (zI000II || objI00O0i0ii2 == obj) {
/* 221 */                   O1o1lI0I o1o1lI0I = new O1o1lI0I(new ContextThemeWrapper(view.getContext(), R.style.EdgeToEdgeFloatingDialogWindowTheme), 0);
/* 224 */                   o1o1lI0I.I00ilI0I1 = illOOo00lI;
/* 226 */                   o1o1lI0I.I00ilO0 = o1oI0oOoi;
/* 228 */                   o1o1lI0I.I00io1l = j;
/* 230 */                   o1o1lI0I.I00ioIO = view;
/* 232 */                   Window window = o1o1lI0I.getWindow();
/* 236 */                   if (window == null) {
/* 537 */                       I000II.I001IO000("Dialog has no window");
/* 540 */                       return;
                            }
/* 239 */                   window.requestFeature(1);
/* 245 */                   window.setBackgroundDrawableResource(android.R.color.transparent);
/* 248 */                   liIIO0.I00000oIO(window, false);
/* 257 */                   O1o1iol1oO0 o1o1iol1oO0 = new O1o1iol1oO0(o1o1lI0I.getContext());
/* 262 */                   OIooliIO0 oIooliIO0I00000oIO = lOO00IiI0li.I00000oIO(i1ilO0Oi1l0I.I00000oIO);
/* 266 */                   o1o1iol1oO0.I00l0OO0IO = oIooliIO0I00000oIO;
/* 268 */                   VarHandle.storeStoreFence();
/* 290 */                   o1o1iol1oO0.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
/* 294 */                   o1o1iol1oO0.setClipChildren(false);
/* 303 */                   o1o1iol1oO0.setElevation(iiIooOOOI.I00i0ilIl0i(8.0f));
/* 312 */                   o1o1iol1oO0.setOutlineProvider(new Iii0oIO(1));
/* 315 */                   o1o1lI0I.I00l0I0l0lO1 = o1o1iol1oO0;
/* 317 */                   o1o1lI0I.setContentView(o1o1iol1oO0);
/* 327 */                   o1o1iol1oO0.setTag(R.id.view_tree_lifecycle_owner, li1lOloO.I00000oIO(view));
/* 337 */                   o1o1iol1oO0.setTag(R.id.view_tree_view_model_store_owner, li1li1Ol11Io.I00000oIO(view));
/* 347 */                   o1o1iol1oO0.setTag(R.id.view_tree_saved_state_registry_owner, li1lOolIO.I00000oIO(view));
/* 364 */                   o1o1lI0I.I0001Ioi1lo(o1o1lI0I.I00ilI0I1, o1o1lI0I.I00ilO0, o1o1lI0I.I00io1l, o0iOOoiioO2);
/* 367 */                   objI00O0i0ii2 = o1o1lI0I;
/* 369 */                   o0iOOoiioO = o0iOOoiioO2;
/* 371 */                   VarHandle.storeStoreFence();
/* 378 */                   IloIlOOIi iloIlOOIi = new IloIlOOIi(19);
/* 381 */                   iloIlOOIi.I00iiI = oI10i0IlI00000oOI;
/* 383 */                   VarHandle.storeStoreFence();
/* 391 */                   z = true;
/* 392 */                   IOii1l iOii1l2 = new IOii1l(1379699857, iloIlOOIi, true);
/* 395 */                   o1o1iol1oO0.setParentCompositionContext(ilo1oliI0000Il00O);
/* 398 */                   oIooliIO0I00000oIO.setValue(iOii1l2);
/* 401 */                   o1o1iol1oO0.I00li1OI = true;
/* 403 */                   o1o1iol1oO0.I0000O();
/* 406 */                   iloI0lOlll1.I00iio(objI00O0i0ii2);
                        } else {
/* 201 */                   o0iOOoiioO = o0iOOoiioO2;
/* 203 */                   z = true;
                        }
/* 409 */               O1o1lI0I o1o1lI0I2 = (O1o1lI0I) objI00O0i0ii2;
/* 411 */               boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(o1o1lI0I2);
/* 415 */               Object objI00O0i0ii3 = iloI0lOlll1.I00O0i0ii();
                        Object obj2 = objI00O0i0ii3;
/* 419 */               if (zI000OOo1O || objI00O0i0ii3 == obj) {
/* 427 */                   O0l0IlolloIO o0l0IlolloIO = new O0l0IlolloIO(21);
/* 430 */                   o0l0IlolloIO.I00iiI = o1o1lI0I2;
/* 432 */                   VarHandle.storeStoreFence();
/* 435 */                   iloI0lOlll1.I00iio(o0l0IlolloIO);
                            obj2 = o0l0IlolloIO;
                        }
/* 440 */               iIO0iiOiOl0l.I00000oOI(o1o1lI0I2, (Function1) obj2, iloI0lOlll1);
/* 499 */               boolean zI000OOo1O2 = iloI0lOlll1.I000OOo1O(o1o1lI0I2) | ((i2 & 14) == 4 ? z : false) | ((i2 & 896) == 256 ? z : false) | (((((i2 & 112) ^ 48) <= 32 || !iloI0lOlll1.I0001Ioi1lo(j)) && (i2 & 48) != 32) ? false : z) | iloI0lOlll1.I0000oI00(o0iOOoiioO.ordinal());
/* 500 */               Object objI00O0i0ii4 = iloI0lOlll1.I00O0i0ii();
                        Object obj3 = objI00O0i0ii4;
/* 504 */               if (zI000OOo1O2 || objI00O0i0ii4 == obj) {
/* 510 */                   O1oI10o1iO o1oI10o1iO = new O1oI10o1iO();
/* 513 */                   o1oI10o1iO.I00iOIl = o1o1lI0I2;
/* 515 */                   o1oI10o1iO.I00iiI = illOOo00lI;
/* 517 */                   o1oI10o1iO.I00iiO = o1oI0oOoi;
/* 519 */                   o1oI10o1iO.I00iio = j;
/* 521 */                   o1oI10o1iO.I00ilI0I1 = o0iOOoiioO;
/* 523 */                   VarHandle.storeStoreFence();
/* 526 */                   iloI0lOlll1.I00iio(o1oI10o1iO);
                            obj3 = o1oI10o1iO;
                        }
/* 531 */               iIO0iiOiOl0l.I0001Ioi1lo((IllOOo00lI) obj3, iloI0lOlll1);
                    } else {
/* 541 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 544 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 548 */           if (oOloioIlI001IO000 != null) {
/* 552 */               O1oII0iOii1o o1oII0iOii1o = new O1oII0iOii1o();
/* 555 */               o1oII0iOii1o.I00iOIl = illOOo00lI;
/* 557 */               o1oII0iOii1o.I00iiI = j;
/* 559 */               o1oII0iOii1o.I00iiO = o1oI0oOoi;
/* 563 */               o1oII0iOii1o.I00iio = iOii1l;
/* 567 */               o1oII0iOii1o.I00ilI0I1 = i;
/* 569 */               VarHandle.storeStoreFence();
/* 572 */               oOloioIlI001IO000.I0000O = o1oII0iOii1o;
                    }
                }
            }
