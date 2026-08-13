            package p000;

            import android.content.Context;
            import android.content.res.Configuration;
            import android.content.res.Resources;
            import android.graphics.drawable.Drawable;
            import android.util.SparseBooleanArray;
            import android.view.LayoutInflater;
            import android.view.MenuItem;
            import android.view.View;
            import android.view.ViewGroup;
            import androidx.appcompat.view.menu.ActionMenuItemView;
            import androidx.appcompat.widget.ActionMenuView;
            import com.box.gallery.R;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            
            public final class I0I1ii0i implements O1l0iiO {
                public final Context I00iOIl;
                public Context I00iiI;
                public O1illlIiilIl I00iiO;
                public final LayoutInflater I00iio;
                public O1l0OiO10IoI I00ilI0I1;
                public O1l0lOll00 I00ioIO;
                public I0I1iI I00l0I0l0lO1;
                public Drawable I00l0OO0IO;
                public boolean I00li1OI;
                public boolean I00ll1;
                public boolean I00lli11;
                public int I00lll10;
                public int I00o0iI0io1;
                public int I00o0l1o1o0;
                public boolean I00o101lO;
                public I0I1IlI1 I00oII;
                public I0I1IlI1 I00oIiI10;
                public IlloOIoilIl I00oO101o;
                public I0I1Ol I00oOio10iI1;
                public final Oi0Oooi I00ol1;
                public final int I00ilO0 = R.layout.abc_action_menu_layout;
                public final int I00io1l = R.layout.abc_action_menu_item_layout;
                public final SparseBooleanArray I00oI0i = new SparseBooleanArray();

                public I0I1ii0i(Context context) {
/* 4 */             this.I00iOIl = context;
/* 10 */            this.I00iio = LayoutInflater.from(context);
/* 33 */            Oi0Oooi oi0Oooi = new Oi0Oooi(1, false);
/* 36 */            oi0Oooi.I00iiI = this;
/* 38 */            VarHandle.storeStoreFence();
/* 41 */            this.I00ol1 = oi0Oooi;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
                /* JADX WARN: Type inference failed for: r5v4, types: [O1l0lO0Ioo1] */
                /* JADX WARN: Type inference failed for: r5v6 */
                /* JADX WARN: Type inference failed for: r5v7 */
                public final View I00000oIO(O1ioIIl o1ioIIl, View view, ViewGroup viewGroup) {
/* 1 */             View actionView = o1ioIIl.getActionView();
/* 6 */             if (actionView == null || o1ioIIl.I0000oI00()) {
/* 29 */                ActionMenuItemView actionMenuItemView = view instanceof O1l0lO0Ioo1 ? (O1l0lO0Ioo1) view : (O1l0lO0Ioo1) this.I00iio.inflate(this.I00io1l, viewGroup, false);
/* 31 */                actionMenuItemView.I00000oIO(o1ioIIl);
/* 39 */                ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
/* 41 */                actionMenuItemView2.setItemInvoker((ActionMenuView) this.I00ioIO);
/* 44 */                I0I1Ol i0I1Ol = this.I00oOio10iI1;
/* 46 */                if (i0I1Ol == null) {
/* 50 */                    i0I1Ol = new I0I1Ol();
/* 53 */                    i0I1Ol.I00000oIO = this;
/* 55 */                    VarHandle.storeStoreFence();
/* 58 */                    this.I00oOio10iI1 = i0I1Ol;
                        }
/* 60 */                actionMenuItemView2.setPopupCallback(i0I1Ol);
/* 64 */                actionView = actionMenuItemView;
                    }
/* 72 */            actionView.setVisibility(o1ioIIl.I001lloI ? 8 : 0);
/* 77 */            ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
/* 81 */            ((ActionMenuView) viewGroup).getClass();
/* 86 */            if (!(layoutParams instanceof I0I1lII000I)) {
/* 92 */                actionView.setLayoutParams(ActionMenuView.I000OiO(layoutParams));
                    }
/* 98 */            return actionView;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override
                public final boolean I00000oOI(Oli1l1l0 oli1l1l0) {
                    boolean z;
/* 6 */             if (oli1l1l0.hasVisibleItems()) {
/* 9 */                 Oli1l1l0 oli1l1l02 = oli1l1l0;
                        while (true) {
/* 10 */                    O1illlIiilIl o1illlIiilIl = oli1l1l02.I001l0I00;
/* 14 */                    if (o1illlIiilIl == this.I00iiO) {
                                break;
                            }
/* 17 */                    oli1l1l02 = (Oli1l1l0) o1illlIiilIl;
                        }
/* 20 */                O1ioIIl o1ioIIl = oli1l1l02.I001lIiIIo1O;
/* 24 */                ViewGroup viewGroup = (ViewGroup) this.I00ioIO;
/* 26 */                View view = null;
/* 27 */                if (viewGroup != null) {
/* 30 */                    int childCount = viewGroup.getChildCount();
/* 34 */                    int i = 0;
                            while (true) {
/* 35 */                        if (i >= childCount) {
                                    break;
                                }
/* 37 */                        View childAt = viewGroup.getChildAt(i);
/* 43 */                        if ((childAt instanceof O1l0lO0Ioo1) && ((O1l0lO0Ioo1) childAt).getItemData() == o1ioIIl) {
/* 54 */                            view = childAt;
                                    break;
                                }
/* 56 */                        i++;
                            }
                        }
/* 59 */                if (view != null) {
/* 64 */                    int size = oli1l1l0.I0001Ioi1lo.size();
/* 68 */                    int i2 = 0;
                            while (true) {
/* 70 */                        if (i2 >= size) {
/* 93 */                            z = false;
                                    break;
                                }
/* 72 */                        MenuItem item = oli1l1l0.getItem(i2);
/* 80 */                        if (item.isVisible() && item.getIcon() != null) {
/* 88 */                            z = true;
                                    break;
                                }
/* 90 */                        i2++;
                            }
/* 98 */                    I0I1IlI1 i0I1IlI1 = new I0I1IlI1(this, this.I00iiI, oli1l1l0, view);
/* 101 */                   this.I00oIiI10 = i0I1IlI1;
/* 103 */                   i0I1IlI1.I000II = z;
/* 105 */                   O1ioll1O01 o1ioll1O01 = i0I1IlI1.I000OOo1O;
/* 107 */                   if (o1ioll1O01 != null) {
/* 109 */                       o1ioll1O01.I000oI1ioi(z);
                            }
/* 112 */                   I0I1IlI1 i0I1IlI12 = this.I00oIiI10;
/* 118 */                   if (!i0I1IlI12.I00000oOI()) {
/* 123 */                       if (i0I1IlI12.I0000oI00 == null) {
/* 138 */                           I000II.I001IO000("MenuPopupHelper cannot be used without an anchor");
/* 5 */                             return false;
                                }
/* 125 */                       i0I1IlI12.I0000O(0, 0, false, false);
                            }
/* 128 */                   O1l0OiO10IoI o1l0OiO10IoI = this.I00ilI0I1;
/* 130 */                   if (o1l0OiO10IoI != null) {
/* 132 */                       o1l0OiO10IoI.I000lI(oli1l1l0);
                            }
/* 69 */                    return true;
                        }
                    }
/* 5 */             return false;
                }

                @Override
                public final boolean I0000Il00O() {
                    int size;
                    ArrayList arrayListI000l1;
                    int i;
                    boolean z;
/* 1 */             I0I1ii0i i0I1ii0i = this;
/* 3 */             O1illlIiilIl o1illlIiilIl = i0I1ii0i.I00iiO;
/* 6 */             if (o1illlIiilIl != null) {
/* 8 */                 arrayListI000l1 = o1illlIiilIl.I000l1();
/* 12 */                size = arrayListI000l1.size();
                    } else {
/* 17 */                size = 0;
/* 18 */                arrayListI000l1 = null;
                    }
/* 19 */            int i2 = i0I1ii0i.I00o0l1o1o0;
/* 21 */            int i3 = i0I1ii0i.I00o0iI0io1;
/* 23 */            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
/* 29 */            ViewGroup viewGroup = (ViewGroup) i0I1ii0i.I00ioIO;
/* 31 */            int i4 = 0;
/* 32 */            boolean z2 = false;
/* 33 */            int i5 = 0;
/* 34 */            int i6 = 0;
                    while (true) {
/* 35 */                i = 2;
/* 36 */                z = true;
/* 37 */                if (i4 >= size) {
                            break;
                        }
/* 43 */                O1ioIIl o1ioIIl = (O1ioIIl) arrayListI000l1.get(i4);
/* 45 */                int i7 = o1ioIIl.I001iOo1i0O;
/* 49 */                if ((i7 & 2) == 2) {
/* 51 */                    i5++;
                        } else if ((i7 & 1) == 1) {
/* 58 */                    i6++;
                        } else {
/* 61 */                    z2 = true;
                        }
/* 64 */                if (i0I1ii0i.I00o101lO && o1ioIIl.I001lloI) {
/* 70 */                    i2 = 0;
                        }
/* 71 */                i4++;
                    }
/* 77 */            if (i0I1ii0i.I00ll1 && (z2 || i6 + i5 > i2)) {
                        i2--;
                    }
/* 86 */            int i8 = i2 - i5;
/* 87 */            SparseBooleanArray sparseBooleanArray = i0I1ii0i.I00oI0i;
/* 89 */            sparseBooleanArray.clear();
/* 92 */            int i9 = 0;
/* 93 */            int i10 = 0;
/* 94 */            while (i9 < size) {
/* 100 */               O1ioIIl o1ioIIl2 = (O1ioIIl) arrayListI000l1.get(i9);
/* 102 */               int i11 = o1ioIIl2.I001iOo1i0O;
/* 110 */               boolean z3 = (i11 & 2) == i ? z : false;
/* 111 */               int i12 = o1ioIIl2.I00000oOI;
/* 113 */               if (z3) {
/* 116 */                   View viewI00000oIO = i0I1ii0i.I00000oIO(o1ioIIl2, null, viewGroup);
/* 120 */                   viewI00000oIO.measure(iMakeMeasureSpec, iMakeMeasureSpec);
/* 123 */                   int measuredWidth = viewI00000oIO.getMeasuredWidth();
/* 127 */                   i3 -= measuredWidth;
/* 128 */                   if (i10 == 0) {
/* 130 */                       i10 = measuredWidth;
                            }
/* 131 */                   if (i12 != 0) {
/* 133 */                       sparseBooleanArray.put(i12, z);
                            }
/* 136 */                   o1ioIIl2.I0001Ioi1lo(z);
                        } else if ((i11 & 1) == z) {
/* 146 */                   boolean z4 = sparseBooleanArray.get(i12);
/* 158 */                   boolean z5 = ((i8 > 0 || z4) && i3 > 0) ? z : false;
/* 160 */                   if (z5) {
/* 162 */                       View viewI00000oIO2 = i0I1ii0i.I00000oIO(o1ioIIl2, null, viewGroup);
/* 166 */                       viewI00000oIO2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
/* 169 */                       int measuredWidth2 = viewI00000oIO2.getMeasuredWidth();
/* 173 */                       i3 -= measuredWidth2;
/* 174 */                       if (i10 == 0) {
/* 176 */                           i10 = measuredWidth2;
                                }
/* 184 */                       z5 &= i3 + i10 > 0;
                            }
/* 185 */                   if (z5 && i12 != 0) {
/* 190 */                       sparseBooleanArray.put(i12, true);
                            } else if (z4) {
/* 197 */                       sparseBooleanArray.put(i12, false);
/* 201 */                       for (int i13 = 0; i13 < i9; i13++) {
/* 207 */                           O1ioIIl o1ioIIl3 = (O1ioIIl) arrayListI000l1.get(i13);
/* 211 */                           if (o1ioIIl3.I00000oOI == i12) {
/* 218 */                               if ((o1ioIIl3.I001i1lo1io & 32) == 32) {
/* 220 */                                   i8++;
                                        }
/* 223 */                               o1ioIIl3.I0001Ioi1lo(false);
                                    }
                                }
                            }
/* 232 */                   if (z5) {
                                i8--;
                            }
/* 236 */                   o1ioIIl2.I0001Ioi1lo(z5);
                        } else {
/* 241 */                   o1ioIIl2.I0001Ioi1lo(false);
/* 244 */                   i9++;
/* 246 */                   i = 2;
/* 247 */                   i0I1ii0i = this;
/* 249 */                   z = true;
                        }
/* 244 */               i9++;
/* 246 */               i = 2;
/* 247 */               i0I1ii0i = this;
/* 249 */               z = true;
                    }
/* 252 */           return z;
                }

                @Override
                public final void I0000O(O1illlIiilIl o1illlIiilIl, boolean z) {
/* 1 */             I0001Ioi1lo();
/* 4 */             I0I1IlI1 i0I1IlI1 = this.I00oIiI10;
/* 6 */             if (i0I1IlI1 != null && i0I1IlI1.I00000oOI()) {
/* 16 */                i0I1IlI1.I000OOo1O.dismiss();
                    }
/* 19 */            O1l0OiO10IoI o1l0OiO10IoI = this.I00ilI0I1;
/* 21 */            if (o1l0OiO10IoI != null) {
/* 23 */                o1l0OiO10IoI.I0000O(o1illlIiilIl, z);
                    }
                }

                @Override
                public final boolean I0000oI00(O1ioIIl o1ioIIl) {
/* 1 */             return false;
                }

                public final boolean I0001Ioi1lo() {
                    Object obj;
/* 1 */             IlloOIoilIl illoOIoilIl = this.I00oO101o;
/* 4 */             if (illoOIoilIl != null && (obj = this.I00ioIO) != null) {
/* 12 */                ((View) obj).removeCallbacks(illoOIoilIl);
/* 16 */                this.I00oO101o = null;
/* 3 */                 return true;
                    }
/* 19 */            I0I1IlI1 i0I1IlI1 = this.I00oII;
/* 21 */            if (i0I1IlI1 == null) {
/* 35 */                return false;
                    }
/* 27 */            if (i0I1IlI1.I00000oOI()) {
/* 31 */                i0I1IlI1.I000OOo1O.dismiss();
                    }
/* 3 */             return true;
                }

                @Override
                public final void I000II(O1l0OiO10IoI o1l0OiO10IoI) {
                    throw null;
                }

                @Override
                public final boolean I000O01llI0(O1ioIIl o1ioIIl) {
/* 1 */             return false;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override
                public final void I000OOo1O() {
                    int i;
/* 3 */             ViewGroup viewGroup = (ViewGroup) this.I00ioIO;
/* 5 */             ArrayList arrayList = null;
/* 6 */             boolean z = false;
/* 7 */             if (viewGroup != null) {
/* 11 */                O1illlIiilIl o1illlIiilIl = this.I00iiO;
/* 13 */                if (o1illlIiilIl != null) {
/* 15 */                    o1illlIiilIl.I000OOo1O();
/* 20 */                    ArrayList arrayListI000l1 = this.I00iiO.I000l1();
/* 24 */                    int size = arrayListI000l1.size();
/* 29 */                    i = 0;
/* 30 */                    for (int i2 = 0; i2 < size; i2++) {
/* 36 */                        O1ioIIl o1ioIIl = (O1ioIIl) arrayListI000l1.get(i2);
/* 43 */                        if ((o1ioIIl.I001i1lo1io & 32) == 32) {
/* 45 */                            View childAt = viewGroup.getChildAt(i);
/* 61 */                            O1ioIIl itemData = childAt instanceof O1l0lO0Ioo1 ? ((O1l0lO0Ioo1) childAt).getItemData() : null;
/* 62 */                            View viewI00000oIO = I00000oIO(o1ioIIl, childAt, viewGroup);
/* 66 */                            if (o1ioIIl != itemData) {
/* 68 */                                viewI00000oIO.setPressed(false);
/* 71 */                                viewI00000oIO.jumpDrawablesToCurrentState();
                                    }
/* 74 */                            if (viewI00000oIO != childAt) {
/* 80 */                                ViewGroup viewGroup2 = (ViewGroup) viewI00000oIO.getParent();
/* 82 */                                if (viewGroup2 != null) {
/* 84 */                                    viewGroup2.removeView(viewI00000oIO);
                                        }
/* 91 */                                ((ViewGroup) this.I00ioIO).addView(viewI00000oIO, i);
                                    }
/* 94 */                            i++;
                                }
                            }
                        } else {
/* 99 */                    i = 0;
                        }
/* 104 */               while (i < viewGroup.getChildCount()) {
/* 112 */                   if (viewGroup.getChildAt(i) == this.I00l0I0l0lO1) {
/* 114 */                       i++;
                            } else {
/* 117 */                       viewGroup.removeViewAt(i);
                            }
                        }
                    }
/* 125 */           ((View) this.I00ioIO).requestLayout();
/* 128 */           O1illlIiilIl o1illlIiilIl2 = this.I00iiO;
/* 130 */           if (o1illlIiilIl2 != null) {
/* 132 */               o1illlIiilIl2.I000OOo1O();
/* 135 */               ArrayList arrayList2 = o1illlIiilIl2.I000OOo1O;
/* 137 */               int size2 = arrayList2.size();
/* 142 */               for (int i3 = 0; i3 < size2; i3++) {
/* 150 */                   O1ioO0 o1ioO0 = ((O1ioIIl) arrayList2.get(i3)).I001lIiIIo1O;
                        }
                    }
/* 155 */           O1illlIiilIl o1illlIiilIl3 = this.I00iiO;
/* 157 */           if (o1illlIiilIl3 != null) {
/* 159 */               o1illlIiilIl3.I000OOo1O();
/* 162 */               arrayList = o1illlIiilIl3.I000OiO;
                    }
/* 167 */           if (this.I00ll1 && arrayList != null) {
/* 171 */               int size3 = arrayList.size();
/* 175 */               if (size3 == 1) {
                            z = !((O1ioIIl) arrayList.get(0)).I001lloI;
                        } else if (size3 > 0) {
/* 190 */                   z = true;
                        }
                    }
/* 191 */           I0I1iI i0I1iI = this.I00l0I0l0lO1;
/* 193 */           if (z) {
/* 195 */               if (i0I1iI == null) {
/* 201 */                   i0I1iI = new I0I1iI(this, this.I00iOIl);
/* 204 */                   this.I00l0I0l0lO1 = i0I1iI;
                        }
/* 210 */               ViewGroup viewGroup3 = (ViewGroup) i0I1iI.getParent();
/* 214 */               if (viewGroup3 != this.I00ioIO) {
/* 216 */                   if (viewGroup3 != null) {
/* 220 */                       viewGroup3.removeView(this.I00l0I0l0lO1);
                            }
/* 225 */                   ActionMenuView actionMenuView = (ActionMenuView) this.I00ioIO;
/* 227 */                   I0I1iI i0I1iI2 = this.I00l0I0l0lO1;
/* 229 */                   actionMenuView.getClass();
/* 232 */                   I0I1lII000I i0I1lII000II000OOo1O = ActionMenuView.I000OOo1O();
/* 236 */                   i0I1lII000II000OOo1O.I00000oIO = true;
/* 238 */                   actionMenuView.addView(i0I1iI2, i0I1lII000II000OOo1O);
                        }
                    } else if (i0I1iI != null) {
/* 244 */               Object parent = i0I1iI.getParent();
/* 248 */               Object obj = this.I00ioIO;
/* 250 */               if (parent == obj) {
/* 256 */                   ((ViewGroup) obj).removeView(this.I00l0I0l0lO1);
                        }
                    }
/* 265 */           ((ActionMenuView) this.I00ioIO).setOverflowReserved(this.I00ll1);
                }

                public final boolean I000OiO() {
/* 1 */             I0I1IlI1 i0I1IlI1 = this.I00oII;
                    return i0I1IlI1 != null && i0I1IlI1.I00000oOI();
                }

                @Override
                public final void I000iOII(Context context, O1illlIiilIl o1illlIiilIl) {
/* 1 */             this.I00iiI = context;
/* 3 */             LayoutInflater.from(context);
/* 6 */             this.I00iiO = o1illlIiilIl;
/* 8 */             Resources resources = context.getResources();
/* 14 */            if (!this.I00lli11) {
/* 17 */                this.I00ll1 = true;
                    }
/* 29 */            int i = 2;
/* 31 */            this.I00lll10 = context.getResources().getDisplayMetrics().widthPixels / 2;
/* 37 */            Configuration configuration = context.getResources().getConfiguration();
/* 41 */            int i2 = configuration.screenWidthDp;
/* 43 */            int i3 = configuration.screenHeightDp;
/* 49 */            if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
/* 91 */                i = 5;
                    } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
/* 89 */                i = 4;
                    } else if (i2 >= 360) {
/* 87 */                i = 3;
                    }
/* 92 */            this.I00o0l1o1o0 = i;
/* 94 */            int measuredWidth = this.I00lll10;
/* 99 */            if (this.I00ll1) {
/* 103 */               if (this.I00l0I0l0lO1 == null) {
/* 109 */                   I0I1iI i0I1iI = new I0I1iI(this, this.I00iOIl);
/* 112 */                   this.I00l0I0l0lO1 = i0I1iI;
/* 117 */                   if (this.I00li1OI) {
/* 121 */                       i0I1iI.setImageDrawable(this.I00l0OO0IO);
/* 124 */                       this.I00l0OO0IO = null;
/* 126 */                       this.I00li1OI = false;
                            }
/* 128 */                   int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
/* 134 */                   this.I00l0I0l0lO1.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        }
/* 143 */               measuredWidth -= this.I00l0I0l0lO1.getMeasuredWidth();
                    } else {
/* 145 */               this.I00l0I0l0lO1 = null;
                    }
/* 147 */           this.I00o0iI0io1 = measuredWidth;
/* 153 */           float f = resources.getDisplayMetrics().density;
                }

                public final boolean I000l1() {
                    O1illlIiilIl o1illlIiilIl;
/* 3 */             if (!this.I00ll1 || I000OiO() || (o1illlIiilIl = this.I00iiO) == null || this.I00ioIO == null || this.I00oO101o != null) {
/* 68 */                return false;
                    }
/* 23 */            o1illlIiilIl.I000OOo1O();
/* 32 */            if (o1illlIiilIl.I000OiO.isEmpty()) {
/* 68 */                return false;
                    }
/* 42 */            I0I1IlI1 i0I1IlI1 = new I0I1IlI1(this, this.I00iiI, this.I00iiO, this.I00l0I0l0lO1);
/* 48 */            IlloOIoilIl illoOIoilIl = new IlloOIoilIl(1);
/* 51 */            illoOIoilIl.I00iiO = this;
/* 53 */            illoOIoilIl.I00iiI = i0I1IlI1;
/* 55 */            VarHandle.storeStoreFence();
/* 58 */            this.I00oO101o = illoOIoilIl;
/* 64 */            ((View) this.I00ioIO).post(illoOIoilIl);
/* 47 */            return true;
                }
            }
