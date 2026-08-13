            package p000;

            import android.content.Context;
            import android.graphics.Rect;
            import android.os.Handler;
            import android.view.Gravity;
            import android.view.KeyEvent;
            import android.view.LayoutInflater;
            import android.view.MenuItem;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.ViewTreeObserver;
            import android.widget.FrameLayout;
            import android.widget.HeaderViewListAdapter;
            import android.widget.ListAdapter;
            import android.widget.PopupWindow;
            import android.widget.TextView;
            import com.box.gallery.R;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            
            public final class IO0iOlIO1o extends O1ioll1O01 implements View.OnKeyListener, PopupWindow.OnDismissListener {
                public Context I00iiI;
                public int I00iiO;
                public int I00iio;
                public boolean I00ilI0I1;
                public Handler I00ilO0;
                public ArrayList I00io1l;
                public ArrayList I00ioIO;
                public I1I0llO0I I00l0I0l0lO1;
                public I0oIl0io0II1 I00l0OO0IO;
                public Oi0Oooi I00li1OI;
                public int I00ll1;
                public int I00lli11;
                public View I00lll10;
                public View I00o0iI0io1;
                public int I00o0l1o1o0;
                public boolean I00o101lO;
                public boolean I00oI0i;
                public int I00oII;
                public int I00oIiI10;
                public boolean I00oO101o;
                public boolean I00oOio10iI1;
                public O1l0OiO10IoI I00ol1;
                public ViewTreeObserver I00olI;
                public PopupWindow.OnDismissListener I00oli;
                public boolean I00oliIiO01i;

                @Override
                public final boolean I00000oIO() {
/* 1 */             ArrayList arrayList = this.I00ioIO;
                    return arrayList.size() > 0 && ((IO0iO0oo1o01) arrayList.get(0)).I00000oIO.I00oliIiO01i.isShowing();
                }

                @Override
                public final boolean I00000oOI(Oli1l1l0 oli1l1l0) {
/* 3 */             Iterator it = this.I00ioIO.iterator();
/* 12 */            while (it.hasNext()) {
/* 18 */                IO0iO0oo1o01 iO0iO0oo1o01 = (IO0iO0oo1o01) it.next();
/* 22 */                if (oli1l1l0 == iO0iO0oo1o01.I00000oOI) {
/* 28 */                    iO0iO0oo1o01.I00000oIO.I00iiO.requestFocus();
/* 11 */                    return true;
                        }
                    }
/* 36 */            if (!oli1l1l0.hasVisibleItems()) {
/* 49 */                return false;
                    }
/* 38 */            I000l1(oli1l1l0);
/* 41 */            O1l0OiO10IoI o1l0OiO10IoI = this.I00ol1;
/* 43 */            if (o1l0OiO10IoI != null) {
/* 45 */                o1l0OiO10IoI.I000lI(oli1l1l0);
                    }
/* 11 */            return true;
                }

                @Override
                public final boolean I0000Il00O() {
/* 1 */             return false;
                }

                @Override
                public final void I0000O(O1illlIiilIl o1illlIiilIl, boolean z) {
/* 1 */             ArrayList arrayList = this.I00ioIO;
/* 3 */             int size = arrayList.size();
/* 8 */             int i = 0;
                    while (true) {
/* 9 */                 if (i >= size) {
/* 25 */                    i = -1;
                            break;
                        } else if (o1illlIiilIl == ((IO0iO0oo1o01) arrayList.get(i)).I00000oOI) {
                            break;
                        } else {
/* 22 */                    i++;
                        }
                    }
/* 26 */            if (i < 0) {
/* 332 */               return;
                    }
/* 30 */            int i2 = i + 1;
/* 36 */            if (i2 < arrayList.size()) {
/* 46 */                ((IO0iO0oo1o01) arrayList.get(i2)).I00000oOI.I0000Il00O(false);
                    }
/* 53 */            IO0iO0oo1o01 iO0iO0oo1o01 = (IO0iO0oo1o01) arrayList.remove(i);
/* 55 */            O1illlIiilIl o1illlIiilIl2 = iO0iO0oo1o01.I00000oOI;
/* 57 */            O1l0IO o1l0IO = iO0iO0oo1o01.I00000oIO;
/* 59 */            I1I0OoiI0o i1I0OoiI0o = o1l0IO.I00oliIiO01i;
/* 61 */            o1illlIiilIl2.I0010I0i(this);
/* 67 */            if (this.I00oliIiO01i) {
/* 69 */                O1l00I1IiO.I00000oOI(i1I0OoiI0o, null);
/* 72 */                i1I0OoiI0o.setAnimationStyle(0);
                    }
/* 75 */            o1l0IO.dismiss();
/* 78 */            int size2 = arrayList.size();
/* 83 */            if (size2 > 0) {
/* 95 */                this.I00o0l1o1o0 = ((IO0iO0oo1o01) arrayList.get(size2 - 1)).I0000Il00O;
                    } else {
/* 109 */               this.I00o0l1o1o0 = this.I00lll10.getLayoutDirection() == 1 ? 0 : 1;
                    }
/* 111 */           if (size2 != 0) {
/* 155 */               if (z) {
/* 165 */                   ((IO0iO0oo1o01) arrayList.get(0)).I00000oOI.I0000Il00O(false);
/* 332 */                   return;
                        }
/* 332 */               return;
                    }
/* 113 */           dismiss();
/* 116 */           O1l0OiO10IoI o1l0OiO10IoI = this.I00ol1;
/* 118 */           if (o1l0OiO10IoI != null) {
/* 120 */               o1l0OiO10IoI.I0000O(o1illlIiilIl, true);
                    }
/* 123 */           ViewTreeObserver viewTreeObserver = this.I00olI;
/* 125 */           if (viewTreeObserver != null) {
/* 131 */               if (viewTreeObserver.isAlive()) {
/* 137 */                   this.I00olI.removeGlobalOnLayoutListener(this.I00l0I0l0lO1);
                        }
/* 140 */               this.I00olI = null;
                    }
/* 146 */           this.I00o0iI0io1.removeOnAttachStateChangeListener(this.I00l0OO0IO);
/* 151 */           this.I00oli.onDismiss();
                }

                @Override
                public final void I0001Ioi1lo() {
/* 1 */             ArrayList arrayList = this.I00io1l;
/* 7 */             if (I00000oIO()) {
/* 110 */               return;
                    }
/* 10 */            Iterator it = arrayList.iterator();
/* 18 */            while (it.hasNext()) {
/* 26 */                I001IIilI0O((O1illlIiilIl) it.next());
                    }
/* 30 */            arrayList.clear();
/* 33 */            View view = this.I00lll10;
/* 35 */            this.I00o0iI0io1 = view;
/* 37 */            if (view != null) {
/* 45 */                boolean z = this.I00olI == null;
/* 46 */                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
/* 50 */                this.I00olI = viewTreeObserver;
/* 52 */                if (z) {
/* 56 */                    viewTreeObserver.addOnGlobalLayoutListener(this.I00l0I0l0lO1);
                        }
/* 63 */                this.I00o0iI0io1.addOnAttachStateChangeListener(this.I00l0OO0IO);
                    }
                }

                @Override
                public final void I000II(O1l0OiO10IoI o1l0OiO10IoI) {
/* 1 */             this.I00ol1 = o1l0OiO10IoI;
                }

                @Override
                public final void I000OOo1O() {
/* 3 */             Iterator it = this.I00ioIO.iterator();
/* 11 */            while (it.hasNext()) {
/* 23 */                ListAdapter adapter = ((IO0iO0oo1o01) it.next()).I00000oIO.I00iiO.getAdapter();
/* 29 */                if (adapter instanceof HeaderViewListAdapter) {
/* 33 */                    adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
                        }
/* 42 */                ((O1ilIool) adapter).notifyDataSetChanged();
                    }
                }

                @Override
                public final Iio010 I000OiO() {
/* 1 */             ArrayList arrayList = this.I00ioIO;
/* 7 */             if (arrayList.isEmpty()) {
/* 9 */                 return null;
                    }
/* 20 */            return ((IO0iO0oo1o01) IIl001iO0Io.I000OiO(1, arrayList)).I00000oIO.I00iiO;
                }

                @Override
                public final void I000l1(O1illlIiilIl o1illlIiilIl) {
/* 3 */             o1illlIiilIl.I00000oOI(this, this.I00iiI);
/* 10 */            if (I00000oIO()) {
/* 12 */                I001IIilI0O(o1illlIiilIl);
                    } else {
/* 18 */                this.I00io1l.add(o1illlIiilIl);
                    }
                }

                @Override
                public final void I000o00OoI0I(View view) {
/* 3 */             if (this.I00lll10 != view) {
/* 5 */                 this.I00lll10 = view;
/* 17 */                this.I00lli11 = Gravity.getAbsoluteGravity(this.I00ll1, view.getLayoutDirection());
                    }
                }

                @Override
                public final void I000oI1ioi(boolean z) {
/* 1 */             this.I00oO101o = z;
                }

                @Override
                public final void I00100l0(int i) {
/* 3 */             if (this.I00ll1 != i) {
/* 5 */                 this.I00ll1 = i;
/* 17 */                this.I00lli11 = Gravity.getAbsoluteGravity(i, this.I00lll10.getLayoutDirection());
                    }
                }

                @Override
                public final void I00100o1O0lo(int i) {
/* 2 */             this.I00o101lO = true;
/* 4 */             this.I00oII = i;
                }

                @Override
                public final void I0010I0i(PopupWindow.OnDismissListener onDismissListener) {
/* 1 */             this.I00oli = onDismissListener;
                }

                @Override
                public final void I0010o(boolean z) {
/* 1 */             this.I00oOio10iI1 = z;
                }

                @Override
                public final void I00111O(int i) {
/* 2 */             this.I00oI0i = true;
/* 4 */             this.I00oIiI10 = i;
                }

                /* JADX WARN: Removed duplicated region for block: B:56:0x0105  */
                /* JADX WARN: Removed duplicated region for block: B:62:0x0145  */
                /* JADX WARN: Removed duplicated region for block: B:68:0x0153  */
                /* JADX WARN: Removed duplicated region for block: B:69:0x0155  */
                /* JADX WARN: Removed duplicated region for block: B:72:0x0160  */
                /* JADX WARN: Removed duplicated region for block: B:75:0x016c  */
                /* JADX WARN: Removed duplicated region for block: B:80:0x0181  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I001IIilI0O(O1illlIiilIl o1illlIiilIl) {
                    boolean z;
                    int i;
                    IO0iO0oo1o01 iO0iO0oo1o01;
                    View childAt;
                    int i2;
                    int i3;
                    MenuItem item;
                    O1ilIool o1ilIool;
                    int headersCount;
                    int firstVisiblePosition;
/* 5 */             ArrayList arrayList = this.I00ioIO;
/* 7 */             Context context = this.I00iiI;
/* 9 */             LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
/* 20 */            O1ilIool o1ilIool2 = new O1ilIool(o1illlIiilIl, layoutInflaterFrom, this.I00ilI0I1, R.layout.abc_cascading_menu_item_layout);
/* 28 */            int i4 = 1;
/* 29 */            if (!I00000oIO() && this.I00oO101o) {
/* 35 */                o1ilIool2.I0000Il00O = true;
                    } else if (I00000oIO()) {
/* 46 */                int size = o1illlIiilIl.I0001Ioi1lo.size();
/* 50 */                int i5 = 0;
                        while (true) {
/* 51 */                    if (i5 >= size) {
/* 74 */                        z = false;
                                break;
                            }
/* 53 */                    MenuItem item2 = o1illlIiilIl.getItem(i5);
/* 61 */                    if (item2.isVisible() && item2.getIcon() != null) {
/* 69 */                        z = true;
                                break;
                            }
/* 71 */                    i5++;
                        }
/* 75 */                o1ilIool2.I0000Il00O = z;
                    }
/* 79 */            int iI000lI = O1ioll1O01.I000lI(o1ilIool2, context, this.I00iiO);
/* 88 */            O1l0IO o1l0IO = new O1l0IO(context, null, this.I00iio, 0);
/* 93 */            o1l0IO.I00oo1iO0ll = this.I00li1OI;
/* 95 */            o1l0IO.I00o0l1o1o0 = this;
/* 97 */            I1I0OoiI0o i1I0OoiI0o = o1l0IO.I00oliIiO01i;
/* 99 */            i1I0OoiI0o.setOnDismissListener(this);
/* 104 */           o1l0IO.I00o0iI0io1 = this.I00lll10;
/* 108 */           o1l0IO.I00ll1 = this.I00lli11;
/* 110 */           o1l0IO.I00oli = true;
/* 112 */           i1I0OoiI0o.setFocusable(true);
/* 116 */           i1I0OoiI0o.setInputMethodMode(2);
/* 119 */           o1l0IO.I00100l0(o1ilIool2);
/* 122 */           o1l0IO.I0010I0i(iI000lI);
/* 127 */           o1l0IO.I00ll1 = this.I00lli11;
/* 133 */           if (arrayList.size() > 0) {
/* 139 */               iO0iO0oo1o01 = (IO0iO0oo1o01) IIl001iO0Io.I000OiO(1, arrayList);
/* 141 */               O1illlIiilIl o1illlIiilIl2 = iO0iO0oo1o01.I00000oOI;
/* 145 */               int size2 = o1illlIiilIl2.I0001Ioi1lo.size();
/* 149 */               int i6 = 0;
                        while (true) {
/* 150 */                   if (i6 >= size2) {
/* 178 */                       i = i4;
/* 180 */                       item = null;
                                break;
                            }
/* 152 */                   item = o1illlIiilIl2.getItem(i6);
/* 160 */                   if (item.hasSubMenu()) {
/* 162 */                       i = i4;
/* 168 */                       if (o1illlIiilIl == item.getSubMenu()) {
                                    break;
                                }
                            } else {
/* 171 */                       i = i4;
                            }
/* 173 */                   i6++;
/* 175 */                   i4 = i;
                        }
/* 181 */               if (item == null) {
/* 183 */                   childAt = null;
                        } else {
/* 187 */                   Iio010 iio010 = iO0iO0oo1o01.I00000oIO.I00iiO;
/* 189 */                   ListAdapter adapter = iio010.getAdapter();
/* 195 */                   if (adapter instanceof HeaderViewListAdapter) {
/* 197 */                       HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
/* 199 */                       headersCount = headerViewListAdapter.getHeadersCount();
/* 207 */                       o1ilIool = (O1ilIool) headerViewListAdapter.getWrappedAdapter();
                            } else {
/* 210 */                       o1ilIool = (O1ilIool) adapter;
/* 212 */                       headersCount = 0;
                            }
/* 213 */                   int count = o1ilIool.getCount();
/* 217 */                   int i7 = 0;
                            while (true) {
/* 219 */                       if (i7 >= count) {
/* 232 */                           i7 = -1;
                                    break;
                                } else if (item == o1ilIool.getItem(i7)) {
                                    break;
                                } else {
/* 228 */                           i7++;
                                }
                            }
/* 233 */                   if (i7 != -1 && (firstVisiblePosition = (i7 + headersCount) - iio010.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < iio010.getChildCount()) {
/* 251 */                       childAt = iio010.getChildAt(firstVisiblePosition);
                            }
                        }
/* 260 */               if (childAt == null) {
/* 263 */                   O1l00lio.I00000oIO(i1I0OoiI0o, false);
/* 267 */                   O1l00I1IiO.I00000oIO(i1I0OoiI0o, null);
/* 284 */                   Iio010 iio0102 = ((IO0iO0oo1o01) arrayList.get(arrayList.size() - 1)).I00000oIO.I00iiO;
/* 287 */                   int[] iArr = new int[2];
/* 289 */                   iio0102.getLocationOnScreen(iArr);
/* 294 */                   Rect rect = new Rect();
/* 299 */                   this.I00o0iI0io1.getWindowVisibleDisplayFrame(rect);
/* 306 */                   if (this.I00o0l1o1o0 == i) {
/* 326 */                       i2 = (iio0102.getWidth() + iArr[0]) + iI000lI > rect.right ? 0 : 1;
/* 342 */                       boolean z2 = i2 != 1;
/* 343 */                       this.I00o0l1o1o0 = i2;
/* 345 */                       o1l0IO.I00o0iI0io1 = childAt;
/* 351 */                       if ((this.I00lli11 & 5) == 5) {
/* 365 */                           i3 = 0;
/* 373 */                           iI000lI = z2 ? childAt.getWidth() : 0 - iI000lI;
                                } else if (z2) {
/* 355 */                           i3 = 0;
                                } else {
/* 361 */                           i3 = 0;
/* 362 */                           iI000lI = 0 - childAt.getWidth();
                                }
/* 375 */                       o1l0IO.I00ilO0 = iI000lI;
/* 378 */                       o1l0IO.I00li1OI = true;
/* 380 */                       o1l0IO.I00l0OO0IO = true;
/* 382 */                       o1l0IO.I000iOII(i3);
                            } else {
/* 333 */                       if (iArr[0] - iI000lI >= 0) {
/* 336 */                           i2 = 0;
                                }
/* 342 */                       if (i2 != 1) {
                                }
/* 343 */                       this.I00o0l1o1o0 = i2;
/* 345 */                       o1l0IO.I00o0iI0io1 = childAt;
/* 351 */                       if ((this.I00lli11 & 5) == 5) {
                                }
/* 375 */                       o1l0IO.I00ilO0 = iI000lI;
/* 378 */                       o1l0IO.I00li1OI = true;
/* 380 */                       o1l0IO.I00l0OO0IO = true;
/* 382 */                       o1l0IO.I000iOII(i3);
                            }
                        } else {
/* 388 */                   if (this.I00o101lO) {
/* 392 */                       o1l0IO.I00ilO0 = this.I00oII;
                            }
/* 396 */                   if (this.I00oI0i) {
/* 400 */                       o1l0IO.I000iOII(this.I00oIiI10);
                            }
/* 403 */                   Rect rect2 = this.I00iOIl;
/* 414 */                   o1l0IO.I00olI = rect2 != null ? new Rect(rect2) : null;
                        }
/* 418 */               int i8 = this.I00o0l1o1o0;
/* 420 */               IO0iO0oo1o01 iO0iO0oo1o012 = new IO0iO0oo1o01();
/* 423 */               iO0iO0oo1o012.I00000oIO = o1l0IO;
/* 425 */               iO0iO0oo1o012.I00000oOI = o1illlIiilIl;
/* 427 */               iO0iO0oo1o012.I0000Il00O = i8;
/* 429 */               VarHandle.storeStoreFence();
/* 432 */               arrayList.add(iO0iO0oo1o012);
/* 435 */               o1l0IO.I0001Ioi1lo();
/* 438 */               Iio010 iio0103 = o1l0IO.I00iiO;
/* 440 */               iio0103.setOnKeyListener(this);
/* 443 */               if (iO0iO0oo1o01 == null || !this.I00oOio10iI1 || o1illlIiilIl.I000lI == null) {
/* 1261 */                  return;
                        }
/* 461 */               FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) iio0103, false);
/* 470 */               TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
/* 472 */               frameLayout.setEnabled(false);
/* 477 */               textView.setText(o1illlIiilIl.I000lI);
/* 481 */               iio0103.addHeaderView(frameLayout, null, false);
/* 484 */               o1l0IO.I0001Ioi1lo();
/* 1261 */              return;
                    }
/* 256 */           i = 1;
/* 258 */           iO0iO0oo1o01 = null;
/* 259 */           childAt = null;
/* 260 */           if (childAt == null) {
                    }
/* 418 */           int i82 = this.I00o0l1o1o0;
/* 420 */           IO0iO0oo1o01 iO0iO0oo1o0122 = new IO0iO0oo1o01();
/* 423 */           iO0iO0oo1o0122.I00000oIO = o1l0IO;
/* 425 */           iO0iO0oo1o0122.I00000oOI = o1illlIiilIl;
/* 427 */           iO0iO0oo1o0122.I0000Il00O = i82;
/* 429 */           VarHandle.storeStoreFence();
/* 432 */           arrayList.add(iO0iO0oo1o0122);
/* 435 */           o1l0IO.I0001Ioi1lo();
/* 438 */           Iio010 iio01032 = o1l0IO.I00iiO;
/* 440 */           iio01032.setOnKeyListener(this);
/* 443 */           if (iO0iO0oo1o01 == null) {
                    }
                }

                @Override
                public final void dismiss() {
/* 1 */             ArrayList arrayList = this.I00ioIO;
/* 3 */             int size = arrayList.size();
/* 7 */             if (size > 0) {
/* 15 */                IO0iO0oo1o01[] iO0iO0oo1o01Arr = (IO0iO0oo1o01[]) arrayList.toArray(new IO0iO0oo1o01[size]);
/* 19 */                for (int i = size - 1; i >= 0; i--) {
/* 21 */                    IO0iO0oo1o01 iO0iO0oo1o01 = iO0iO0oo1o01Arr[i];
/* 31 */                    if (iO0iO0oo1o01.I00000oIO.I00oliIiO01i.isShowing()) {
/* 35 */                        iO0iO0oo1o01.I00000oIO.dismiss();
                            }
                        }
                    }
                }

                @Override
                public final void onDismiss() {
                    IO0iO0oo1o01 iO0iO0oo1o01;
/* 1 */             ArrayList arrayList = this.I00ioIO;
/* 3 */             int size = arrayList.size();
/* 8 */             int i = 0;
                    while (true) {
/* 9 */                 if (i >= size) {
/* 31 */                    iO0iO0oo1o01 = null;
                            break;
                        }
/* 15 */                iO0iO0oo1o01 = (IO0iO0oo1o01) arrayList.get(i);
/* 25 */                if (!iO0iO0oo1o01.I00000oIO.I00oliIiO01i.isShowing()) {
                            break;
                        } else {
/* 28 */                    i++;
                        }
                    }
/* 32 */            if (iO0iO0oo1o01 != null) {
/* 36 */                iO0iO0oo1o01.I00000oOI.I0000Il00O(false);
                    }
                }

                @Override
                public final boolean onKey(View view, int i, KeyEvent keyEvent) {
/* 6 */             if (keyEvent.getAction() != 1 || i != 82) {
/* 16 */                return false;
                    }
/* 12 */            dismiss();
/* 5 */             return true;
                }
            }
