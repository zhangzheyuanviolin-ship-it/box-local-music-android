            package p000;

            import android.content.Context;
            import android.graphics.Rect;
            import android.view.Gravity;
            import android.view.KeyEvent;
            import android.view.LayoutInflater;
            import android.view.MenuItem;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.ViewTreeObserver;
            import android.widget.FrameLayout;
            import android.widget.PopupWindow;
            import android.widget.TextView;
            import com.box.gallery.R;
            
/* 27 */    public final class OlIlil1IO1I extends O1ioll1O01 implements PopupWindow.OnDismissListener, View.OnKeyListener {
                public Context I00iiI;
                public O1illlIiilIl I00iiO;
                public O1ilIool I00iio;
                public boolean I00ilI0I1;
                public int I00ilO0;
                public int I00io1l;
                public O1l0IO I00ioIO;
                public I1I0llO0I I00l0I0l0lO1;
                public I0oIl0io0II1 I00l0OO0IO;
                public PopupWindow.OnDismissListener I00li1OI;
                public View I00ll1;
                public View I00lli11;
                public O1l0OiO10IoI I00lll10;
                public ViewTreeObserver I00o0iI0io1;
                public boolean I00o0l1o1o0;
                public boolean I00o101lO;
                public int I00oI0i;
                public int I00oII;
                public boolean I00oIiI10;

                @Override
                public final boolean I00000oIO() {
                    return !this.I00o0l1o1o0 && this.I00ioIO.I00oliIiO01i.isShowing();
                }

                @Override
                public final boolean I00000oOI(Oli1l1l0 oli1l1l0) {
                    boolean z;
/* 6 */             if (oli1l1l0.hasVisibleItems()) {
/* 20 */                O1ioooII10 o1ioooII10 = new O1ioooII10(this.I00iiI, oli1l1l0, this.I00lli11, this.I00ilI0I1, this.I00io1l, 0);
/* 23 */                O1l0OiO10IoI o1l0OiO10IoI = this.I00lll10;
/* 25 */                o1ioooII10.I000O01llI0 = o1l0OiO10IoI;
/* 27 */                O1ioll1O01 o1ioll1O01 = o1ioooII10.I000OOo1O;
/* 29 */                if (o1ioll1O01 != null) {
/* 31 */                    o1ioll1O01.I000II(o1l0OiO10IoI);
                        }
/* 36 */                int size = oli1l1l0.I0001Ioi1lo.size();
/* 40 */                int i = 0;
                        while (true) {
/* 42 */                    if (i >= size) {
/* 65 */                        z = false;
                                break;
                            }
/* 44 */                    MenuItem item = oli1l1l0.getItem(i);
/* 52 */                    if (item.isVisible() && item.getIcon() != null) {
/* 60 */                        z = true;
                                break;
                            }
/* 62 */                    i++;
                        }
/* 66 */                o1ioooII10.I000II = z;
/* 68 */                O1ioll1O01 o1ioll1O012 = o1ioooII10.I000OOo1O;
/* 70 */                if (o1ioll1O012 != null) {
/* 72 */                    o1ioll1O012.I000oI1ioi(z);
                        }
/* 77 */                o1ioooII10.I000OiO = this.I00li1OI;
/* 80 */                this.I00li1OI = null;
/* 84 */                this.I00iiO.I0000Il00O(false);
/* 87 */                O1l0IO o1l0IO = this.I00ioIO;
/* 89 */                int width = o1l0IO.I00ilO0;
/* 91 */                int iI000oI1ioi = o1l0IO.I000oI1ioi();
/* 110 */               if ((Gravity.getAbsoluteGravity(this.I00oII, this.I00ll1.getLayoutDirection()) & 7) == 5) {
/* 118 */                   width += this.I00ll1.getWidth();
                        }
/* 123 */               if (!o1ioooII10.I00000oOI()) {
/* 128 */                   if (o1ioooII10.I0000oI00 != null) {
/* 131 */                       o1ioooII10.I0000O(width, iI000oI1ioi, true, true);
                            }
                        }
/* 134 */               O1l0OiO10IoI o1l0OiO10IoI2 = this.I00lll10;
/* 136 */               if (o1l0OiO10IoI2 != null) {
/* 138 */                   o1l0OiO10IoI2.I000lI(oli1l1l0);
                        }
/* 41 */                return true;
                    }
/* 5 */             return false;
                }

                @Override
                public final boolean I0000Il00O() {
/* 1 */             return false;
                }

                @Override
                public final void I0000O(O1illlIiilIl o1illlIiilIl, boolean z) {
/* 3 */             if (o1illlIiilIl != this.I00iiO) {
/* 37 */                return;
                    }
/* 6 */             dismiss();
/* 9 */             O1l0OiO10IoI o1l0OiO10IoI = this.I00lll10;
/* 11 */            if (o1l0OiO10IoI != null) {
/* 13 */                o1l0OiO10IoI.I0000O(o1illlIiilIl, z);
                    }
                }

                @Override
                public final void I0001Ioi1lo() {
                    View view;
/* 1 */             O1illlIiilIl o1illlIiilIl = this.I00iiO;
/* 3 */             Context context = this.I00iiI;
/* 5 */             O1ilIool o1ilIool = this.I00iio;
/* 7 */             O1l0IO o1l0IO = this.I00ioIO;
/* 13 */            if (I00000oIO()) {
/* 15 */                return;
                    }
/* 18 */            if (this.I00o0l1o1o0 || (view = this.I00ll1) == null) {
/* 172 */               I000II.I001IO000("StandardMenuPopup cannot be used without an anchor");
/* 245 */               return;
                    }
/* 24 */            this.I00lli11 = view;
/* 26 */            I1I0OoiI0o i1I0OoiI0o = o1l0IO.I00oliIiO01i;
/* 28 */            I1I0OoiI0o i1I0OoiI0o2 = o1l0IO.I00oliIiO01i;
/* 30 */            i1I0OoiI0o.setOnDismissListener(this);
/* 33 */            o1l0IO.I00o0l1o1o0 = this;
/* 36 */            o1l0IO.I00oli = true;
/* 38 */            i1I0OoiI0o2.setFocusable(true);
/* 41 */            View view2 = this.I00lli11;
/* 50 */            boolean z = this.I00o0iI0io1 == null;
/* 51 */            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
/* 55 */            this.I00o0iI0io1 = viewTreeObserver;
/* 57 */            if (z) {
/* 61 */                viewTreeObserver.addOnGlobalLayoutListener(this.I00l0I0l0lO1);
                    }
/* 66 */            view2.addOnAttachStateChangeListener(this.I00l0OO0IO);
/* 69 */            o1l0IO.I00o0iI0io1 = view2;
/* 73 */            o1l0IO.I00ll1 = this.I00oII;
/* 77 */            if (!this.I00o101lO) {
/* 85 */                this.I00oI0i = O1ioll1O01.I000lI(o1ilIool, context, this.I00ilO0);
/* 87 */                this.I00o101lO = true;
                    }
/* 91 */            o1l0IO.I0010I0i(this.I00oI0i);
/* 95 */            i1I0OoiI0o2.setInputMethodMode(2);
/* 98 */            Rect rect = this.I00iOIl;
/* 110 */           o1l0IO.I00olI = rect != null ? new Rect(rect) : null;
/* 112 */           o1l0IO.I0001Ioi1lo();
/* 115 */           Iio010 iio010 = o1l0IO.I00iiO;
/* 117 */           iio010.setOnKeyListener(this);
/* 122 */           if (this.I00oIiI10 && o1illlIiilIl.I000lI != null) {
/* 139 */               FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) iio010, false);
/* 148 */               TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
/* 150 */               if (textView != null) {
/* 154 */                   textView.setText(o1illlIiilIl.I000lI);
                        }
/* 157 */               frameLayout.setEnabled(false);
/* 160 */               iio010.addHeaderView(frameLayout, null, false);
                    }
/* 163 */           o1l0IO.I00100l0(o1ilIool);
/* 166 */           o1l0IO.I0001Ioi1lo();
                }

                @Override
                public final void I000II(O1l0OiO10IoI o1l0OiO10IoI) {
/* 1 */             this.I00lll10 = o1l0OiO10IoI;
                }

                @Override
                public final void I000OOo1O() {
/* 2 */             this.I00o101lO = false;
/* 4 */             O1ilIool o1ilIool = this.I00iio;
/* 6 */             if (o1ilIool != null) {
/* 8 */                 o1ilIool.notifyDataSetChanged();
                    }
                }

                @Override
                public final Iio010 I000OiO() {
/* 3 */             return this.I00ioIO.I00iiO;
                }

                @Override
                public final void I000o00OoI0I(View view) {
/* 1 */             this.I00ll1 = view;
                }

                @Override
                public final void I000oI1ioi(boolean z) {
/* 3 */             this.I00iio.I0000Il00O = z;
                }

                @Override
                public final void I00100l0(int i) {
/* 1 */             this.I00oII = i;
                }

                @Override
                public final void I00100o1O0lo(int i) {
/* 3 */             this.I00ioIO.I00ilO0 = i;
                }

                @Override
                public final void I0010I0i(PopupWindow.OnDismissListener onDismissListener) {
/* 1 */             this.I00li1OI = onDismissListener;
                }

                @Override
                public final void I0010o(boolean z) {
/* 1 */             this.I00oIiI10 = z;
                }

                @Override
                public final void I00111O(int i) {
/* 3 */             this.I00ioIO.I000iOII(i);
                }

                @Override
                public final void dismiss() {
/* 5 */             if (I00000oIO()) {
/* 9 */                 this.I00ioIO.dismiss();
                    }
                }

                @Override
                public final void onDismiss() {
/* 2 */             this.I00o0l1o1o0 = true;
/* 6 */             this.I00iiO.I0000Il00O(true);
/* 9 */             ViewTreeObserver viewTreeObserver = this.I00o0iI0io1;
/* 11 */            if (viewTreeObserver != null) {
/* 17 */                if (!viewTreeObserver.isAlive()) {
/* 25 */                    this.I00o0iI0io1 = this.I00lli11.getViewTreeObserver();
                        }
/* 31 */                this.I00o0iI0io1.removeGlobalOnLayoutListener(this.I00l0I0l0lO1);
/* 35 */                this.I00o0iI0io1 = null;
                    }
/* 41 */            this.I00lli11.removeOnAttachStateChangeListener(this.I00l0OO0IO);
/* 44 */            PopupWindow.OnDismissListener onDismissListener = this.I00li1OI;
/* 46 */            if (onDismissListener != null) {
/* 48 */                onDismissListener.onDismiss();
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

                @Override
/* 28 */        public final void I000l1(O1illlIiilIl o1illlIiilIl) {
                }
            }
