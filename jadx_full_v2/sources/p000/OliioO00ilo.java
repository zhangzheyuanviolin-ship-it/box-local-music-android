            package p000;

            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.graphics.PorterDuff;
            import android.util.Log;
            import android.view.InflateException;
            import android.view.Menu;
            import android.view.MenuItem;
            import android.view.View;
            import java.lang.reflect.Constructor;
            import java.lang.reflect.Method;
            
            public final class OliioO00ilo {
                public Menu I00000oIO;
                public int I00000oOI;
                public int I0000Il00O;
                public int I0000O;
                public int I0000oI00;
                public boolean I0001Ioi1lo;
                public boolean I000II;
                public boolean I000O01llI0;
                public int I000OOo1O;
                public int I000OiO;
                public CharSequence I000iOII;
                public CharSequence I000l1;
                public int I000lI;
                public char I000o00OoI0I;
                public int I000oI1ioi;
                public char I00100l0;
                public int I00100o1O0lo;
                public int I0010I0i;
                public boolean I0010o;
                public boolean I00111O;
                public boolean I001IIilI0O;
                public int I001IO000;
                public int I001i1O0Ol;
                public String I001i1lo1io;
                public String I001iOo1i0O;
                public O1ioO0 I001l0I00;
                public CharSequence I001lIiIIo1O;
                public CharSequence I001lllioOl;
                public ColorStateList I001lloI;
                public PorterDuff.Mode I00II0Ol1O0l;
                public OliioiiiOo I00II0oii1o;

                public final Object I00000oIO(String str, Class[] clsArr, Object[] objArr) throws NoSuchMethodException, SecurityException {
                    try {
/* 14 */                Constructor<?> constructor = Class.forName(str, false, this.I00II0oii1o.I0000Il00O.getClassLoader()).getConstructor(clsArr);
/* 19 */                constructor.setAccessible(true);
/* 22 */                return constructor.newInstance(objArr);
                    } catch (Exception e) {
/* 44 */                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
/* 47 */                return null;
                    }
                }

                public final void I00000oOI(MenuItem menuItem) {
/* 1 */             OliioiiiOo oliioiiiOo = this.I00II0oii1o;
/* 3 */             Context context = oliioiiiOo.I0000Il00O;
/* 25 */            int i = 0;
/* 44 */            menuItem.setChecked(this.I0010o).setVisible(this.I00111O).setEnabled(this.I001IIilI0O).setCheckable(this.I0010I0i >= 1).setTitleCondensed(this.I000l1).setIcon(this.I000lI);
/* 47 */            int i2 = this.I001IO000;
/* 49 */            if (i2 >= 0) {
/* 51 */                menuItem.setShowAsAction(i2);
                    }
/* 56 */            if (this.I001iOo1i0O != null) {
/* 62 */                if (context.isRestricted()) {
/* 130 */                   I000II.I001IO000("The android:onClick attribute cannot be used within a restricted context");
/* 133 */                   return;
                        }
/* 66 */                Object objI00000oIO = oliioiiiOo.I0000O;
/* 68 */                if (objI00000oIO == null) {
/* 70 */                    objI00000oIO = OliioiiiOo.I00000oIO(context);
/* 74 */                    oliioiiiOo.I0000O = objI00000oIO;
                        }
/* 76 */                String str = this.I001iOo1i0O;
/* 78 */                Oliio001lill oliio001lill = new Oliio001lill(i);
/* 81 */                oliio001lill.I00000oOI = objI00000oIO;
/* 83 */                Class<?> cls = objI00000oIO.getClass();
                        try {
/* 93 */                    oliio001lill.I0000Il00O = cls.getMethod(str, Oliio001lill.I0000O);
/* 95 */                    menuItem.setOnMenuItemClickListener(oliio001lill);
                        } catch (Exception e) {
/* 106 */                   StringBuilder sbI001IIilI0O = IIlIOloOOO.I001IIilI0O("Couldn't resolve menu item onClick handler ", str, " in class ");
/* 114 */                   sbI001IIilI0O.append(cls.getName());
/* 121 */                   InflateException inflateException = new InflateException(sbI001IIilI0O.toString());
/* 124 */                   inflateException.initCause(e);
/* 127 */                   throw inflateException;
                        }
                    }
/* 137 */           if (this.I0010I0i >= 2) {
/* 141 */               if (menuItem instanceof O1ioIIl) {
/* 144 */                   O1ioIIl o1ioIIl = (O1ioIIl) menuItem;
/* 152 */                   o1ioIIl.I001i1lo1io = (o1ioIIl.I001i1lo1io & (-5)) | 4;
                        } else if (menuItem instanceof O1ioi1oo0Ol) {
/* 160 */                   O1ioi1oo0Ol o1ioi1oo0Ol = (O1ioi1oo0Ol) menuItem;
/* 162 */                   OliiollI oliiollI = o1ioi1oo0Ol.I0000Il00O;
                            try {
/* 164 */                       Method declaredMethod = o1ioi1oo0Ol.I0000O;
/* 166 */                       if (declaredMethod == null) {
/* 180 */                           declaredMethod = oliiollI.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
/* 184 */                           o1ioi1oo0Ol.I0000O = declaredMethod;
                                }
/* 195 */                       declaredMethod.invoke(oliiollI, Boolean.TRUE);
                            } catch (Exception e2) {
/* 203 */                       Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
                            }
                        }
                    }
/* 206 */           String str2 = this.I001i1lo1io;
/* 208 */           if (str2 != null) {
/* 220 */               menuItem.setActionView((View) I00000oIO(str2, OliioiiiOo.I0000oI00, oliioiiiOo.I00000oIO));
/* 223 */               i = 1;
                    }
/* 224 */           int i3 = this.I001i1O0Ol;
/* 226 */           if (i3 > 0) {
/* 228 */               if (i == 0) {
/* 230 */                   menuItem.setActionView(i3);
                        } else {
/* 238 */                   Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                        }
                    }
/* 241 */           O1ioO0 o1ioO0 = this.I001l0I00;
/* 243 */           if (o1ioO0 != null) {
/* 247 */               if (menuItem instanceof OliiollI) {
/* 252 */                   ((OliiollI) menuItem).I00000oIO(o1ioO0);
                        } else {
/* 260 */                   Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
                        }
                    }
/* 263 */           CharSequence charSequence = this.I001lIiIIo1O;
/* 265 */           boolean z = menuItem instanceof OliiollI;
/* 267 */           if (z) {
/* 272 */               ((OliiollI) menuItem).setContentDescription(charSequence);
                    } else {
/* 276 */               menuItem.setContentDescription(charSequence);
                    }
/* 279 */           CharSequence charSequence2 = this.I001lllioOl;
/* 281 */           if (z) {
/* 286 */               ((OliiollI) menuItem).setTooltipText(charSequence2);
                    } else {
/* 290 */               menuItem.setTooltipText(charSequence2);
                    }
/* 293 */           char c = this.I000o00OoI0I;
/* 295 */           int i4 = this.I000oI1ioi;
/* 297 */           if (z) {
/* 302 */               ((OliiollI) menuItem).setAlphabeticShortcut(c, i4);
                    } else {
/* 306 */               menuItem.setAlphabeticShortcut(c, i4);
                    }
/* 309 */           char c2 = this.I00100l0;
/* 311 */           int i5 = this.I00100o1O0lo;
/* 313 */           if (z) {
/* 318 */               ((OliiollI) menuItem).setNumericShortcut(c2, i5);
                    } else {
/* 322 */               menuItem.setNumericShortcut(c2, i5);
                    }
/* 325 */           PorterDuff.Mode mode = this.I00II0Ol1O0l;
/* 327 */           if (mode != null) {
/* 329 */               if (z) {
/* 334 */                   ((OliiollI) menuItem).setIconTintMode(mode);
                        } else {
/* 338 */                   menuItem.setIconTintMode(mode);
                        }
                    }
/* 341 */           ColorStateList colorStateList = this.I001lloI;
/* 343 */           if (colorStateList != null) {
/* 345 */               if (z) {
/* 349 */                   ((OliiollI) menuItem).setIconTintList(colorStateList);
                        } else {
/* 353 */                   menuItem.setIconTintList(colorStateList);
                        }
                    }
                }
            }
