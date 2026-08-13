            package androidx.appcompat.view.menu;

            import android.content.Context;
            import android.content.res.Resources;
            import android.content.res.TypedArray;
            import android.graphics.Rect;
            import android.graphics.drawable.Drawable;
            import android.util.AttributeSet;
            import android.view.LayoutInflater;
            import android.view.ViewConfiguration;
            import android.view.ViewGroup;
            import android.widget.AbsListView;
            import android.widget.CheckBox;
            import android.widget.CompoundButton;
            import android.widget.ImageView;
            import android.widget.LinearLayout;
            import android.widget.RadioButton;
            import android.widget.TextView;
            import com.box.gallery.R;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import p000.O1illlIiilIl;
            import p000.O1ioIIl;
            import p000.O1l0lO0Ioo1;
            import p000.OOilOli0;
            import p000.OlilOlOiI;
            
            public class ListMenuItemView extends LinearLayout implements O1l0lO0Ioo1, AbsListView.SelectionBoundsAdjuster {
                public O1ioIIl I00iOIl;
                public ImageView I00iiI;
                public RadioButton I00iiO;
                public TextView I00iio;
                public CheckBox I00ilI0I1;
                public TextView I00ilO0;
                public ImageView I00io1l;
                public ImageView I00ioIO;
                public LinearLayout I00l0I0l0lO1;
                public final Drawable I00l0OO0IO;
                public final int I00li1OI;
                public final Context I00ll1;
                public boolean I00lli11;
                public final Drawable I00lll10;
                public final boolean I00o0iI0io1;
                public LayoutInflater I00o0l1o1o0;
                public boolean I00o101lO;

                public ListMenuItemView(Context context, AttributeSet attributeSet) {
/* 1 */             super(context, attributeSet);
/* 13 */            OlilOlOiI olilOlOiII0010I0i = OlilOlOiI.I0010I0i(getContext(), attributeSet, OOilOli0.I0010I0i, R.attr.listMenuViewStyle);
/* 22 */            this.I00l0OO0IO = olilOlOiII0010I0i.I000iOII(5);
/* 26 */            TypedArray typedArray = (TypedArray) olilOlOiII0010I0i.I00iiO;
/* 34 */            this.I00li1OI = typedArray.getResourceId(1, -1);
/* 42 */            this.I00lli11 = typedArray.getBoolean(7, false);
/* 44 */            this.I00ll1 = context;
/* 52 */            this.I00lll10 = olilOlOiII0010I0i.I000iOII(8);
/* 69 */            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
/* 77 */            this.I00o0iI0io1 = typedArrayObtainStyledAttributes.hasValue(0);
/* 79 */            olilOlOiII0010I0i.I0010o();
/* 82 */            typedArrayObtainStyledAttributes.recycle();
                }

                private LayoutInflater getInflater() {
/* 1 */             LayoutInflater layoutInflater = this.I00o0l1o1o0;
/* 3 */             if (layoutInflater != null) {
/* 20 */                return layoutInflater;
                    }
/* 9 */             LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
/* 13 */            this.I00o0l1o1o0 = layoutInflaterFrom;
/* 20 */            return layoutInflaterFrom;
                }

                private void setSubMenuArrowVisible(boolean z) {
/* 1 */             ImageView imageView = this.I00io1l;
/* 3 */             if (imageView != null) {
/* 11 */                imageView.setVisibility(z ? 0 : 8);
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
                /* JADX WARN: Removed duplicated region for block: B:25:0x0053  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I00000oIO(O1ioIIl o1ioIIl) {
                    boolean z;
                    String string;
/* 1 */             this.I00iOIl = o1ioIIl;
/* 3 */             boolean zIsVisible = o1ioIIl.isVisible();
/* 7 */             O1illlIiilIl o1illlIiilIl = o1ioIIl.I000o00OoI0I;
/* 11 */            int i = 0;
/* 17 */            setVisibility(zIsVisible ? 0 : 8);
/* 22 */            setTitle(o1ioIIl.I0000oI00);
/* 29 */            setCheckable(o1ioIIl.isCheckable());
/* 37 */            if (o1illlIiilIl.I000oI1ioi()) {
/* 50 */                if ((o1illlIiilIl.I000o00OoI0I() ? o1ioIIl.I000OiO : o1ioIIl.I000O01llI0) != 0) {
/* 52 */                    z = true;
                        }
                    } else {
/* 54 */                z = false;
                    }
/* 55 */            o1illlIiilIl.I000o00OoI0I();
/* 58 */            if (z) {
/* 60 */                O1ioIIl o1ioIIl2 = this.I00iOIl;
/* 62 */                O1illlIiilIl o1illlIiilIl2 = o1ioIIl2.I000o00OoI0I;
/* 68 */                if (o1illlIiilIl2.I000oI1ioi()) {
/* 81 */                    if ((o1illlIiilIl2.I000o00OoI0I() ? o1ioIIl2.I000OiO : o1ioIIl2.I000O01llI0) == 0) {
                            }
                        } else {
/* 84 */                    i = 8;
                        }
                    }
/* 85 */            if (i == 0) {
/* 87 */                TextView textView = this.I00ilO0;
/* 89 */                O1ioIIl o1ioIIl3 = this.I00iOIl;
/* 91 */                O1illlIiilIl o1illlIiilIl3 = o1ioIIl3.I000o00OoI0I;
/* 93 */                Context context = o1illlIiilIl3.I00000oIO;
/* 104 */               char c = o1illlIiilIl3.I000o00OoI0I() ? o1ioIIl3.I000OiO : o1ioIIl3.I000O01llI0;
/* 106 */               if (c == 0) {
/* 108 */                   string = "";
                        } else {
/* 112 */                   Resources resources = context.getResources();
/* 118 */                   StringBuilder sb = new StringBuilder();
/* 129 */                   if (ViewConfiguration.get(context).hasPermanentMenuKey()) {
/* 138 */                       sb.append(resources.getString(R.string.abc_prepend_shortcut_label));
                            }
/* 150 */                   int i2 = o1illlIiilIl3.I000o00OoI0I() ? o1ioIIl3.I000iOII : o1ioIIl3.I000OOo1O;
/* 161 */                   O1ioIIl.I00000oOI(i2, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label), sb);
/* 173 */                   O1ioIIl.I00000oOI(i2, Barcode.FORMAT_AZTEC, resources.getString(R.string.abc_menu_ctrl_shortcut_label), sb);
/* 184 */                   O1ioIIl.I00000oOI(i2, 2, resources.getString(R.string.abc_menu_alt_shortcut_label), sb);
/* 194 */                   O1ioIIl.I00000oOI(i2, 1, resources.getString(R.string.abc_menu_shift_shortcut_label), sb);
/* 205 */                   O1ioIIl.I00000oOI(i2, 4, resources.getString(R.string.abc_menu_sym_shortcut_label), sb);
/* 215 */                   O1ioIIl.I00000oOI(i2, 8, resources.getString(R.string.abc_menu_function_shortcut_label), sb);
/* 218 */                   if (c == '\b') {
/* 261 */                       sb.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                            } else if (c == '\n') {
/* 250 */                       sb.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                            } else if (c != ' ') {
/* 228 */                       sb.append(c);
                            } else {
/* 239 */                       sb.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                            }
/* 264 */                   string = sb.toString();
                        }
/* 268 */               textView.setText(string);
                    }
/* 277 */           if (this.I00ilO0.getVisibility() != i) {
/* 281 */               this.I00ilO0.setVisibility(i);
                    }
/* 288 */           setIcon(o1ioIIl.getIcon());
/* 295 */           setEnabled(o1ioIIl.isEnabled());
/* 302 */           setSubMenuArrowVisible(o1ioIIl.hasSubMenu());
/* 307 */           setContentDescription(o1ioIIl.I00100o1O0lo);
                }

                @Override
                public final void adjustListItemSelectionBounds(Rect rect) {
/* 1 */             ImageView imageView = this.I00ioIO;
/* 3 */             if (imageView == null || imageView.getVisibility() != 0) {
/* 77 */                return;
                    }
/* 17 */            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.I00ioIO.getLayoutParams();
/* 34 */            rect.top = this.I00ioIO.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
                }

                @Override
                public O1ioIIl getItemData() {
/* 1 */             return this.I00iOIl;
                }

                @Override
                public final void onFinishInflate() {
/* 1 */             super.onFinishInflate();
/* 6 */             setBackground(this.I00l0OO0IO);
/* 16 */            TextView textView = (TextView) findViewById(R.id.title);
/* 18 */            this.I00iio = textView;
/* 21 */            int i = this.I00li1OI;
/* 23 */            if (i != -1) {
/* 27 */                textView.setTextAppearance(this.I00ll1, i);
                    }
/* 39 */            this.I00ilO0 = (TextView) findViewById(R.id.shortcut);
/* 48 */            ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
/* 50 */            this.I00io1l = imageView;
/* 52 */            if (imageView != null) {
/* 56 */                imageView.setImageDrawable(this.I00lll10);
                    }
/* 68 */            this.I00ioIO = (ImageView) findViewById(R.id.group_divider);
/* 79 */            this.I00l0I0l0lO1 = (LinearLayout) findViewById(R.id.content);
                }

                @Override
                public final void onMeasure(int i, int i2) {
/* 3 */             if (this.I00iiI != null && this.I00lli11) {
/* 9 */                 ViewGroup.LayoutParams layoutParams = getLayoutParams();
/* 19 */                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.I00iiI.getLayoutParams();
/* 21 */                int i3 = layoutParams.height;
/* 23 */                if (i3 > 0 && layoutParams2.width <= 0) {
/* 29 */                    layoutParams2.width = i3;
                        }
                    }
/* 31 */            super.onMeasure(i, i2);
                }

                public void setCheckable(boolean z) {
                    CompoundButton compoundButton;
                    CompoundButton compoundButton2;
                    CompoundButton compoundButton3;
/* 1 */             if (!z && this.I00iiO == null && this.I00ilI0I1 == null) {
/* 168 */               return;
                    }
/* 21 */            if ((this.I00iOIl.I001i1lo1io & 4) != 0) {
/* 25 */                if (this.I00iiO == null) {
/* 38 */                    RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
/* 40 */                    this.I00iiO = radioButton;
/* 42 */                    LinearLayout linearLayout = this.I00l0I0l0lO1;
/* 44 */                    if (linearLayout != null) {
/* 46 */                        linearLayout.addView(radioButton, -1);
                            } else {
/* 50 */                        addView(radioButton, -1);
                            }
                        }
/* 53 */                compoundButton = this.I00iiO;
/* 55 */                compoundButton2 = this.I00ilI0I1;
/* 57 */                compoundButton3 = compoundButton2;
                    } else {
/* 61 */                if (this.I00ilI0I1 == null) {
/* 74 */                    CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
/* 76 */                    this.I00ilI0I1 = checkBox;
/* 78 */                    LinearLayout linearLayout2 = this.I00l0I0l0lO1;
/* 80 */                    if (linearLayout2 != null) {
/* 82 */                        linearLayout2.addView(checkBox, -1);
                            } else {
/* 86 */                        addView(checkBox, -1);
                            }
                        }
/* 89 */                compoundButton = this.I00ilI0I1;
/* 91 */                compoundButton2 = this.I00iiO;
/* 93 */                compoundButton3 = compoundButton;
                    }
/* 96 */            if (!z) {
/* 128 */               if (compoundButton3 != null) {
/* 130 */                   compoundButton3.setVisibility(8);
                        }
/* 133 */               RadioButton radioButton2 = this.I00iiO;
/* 135 */               if (radioButton2 != null) {
/* 137 */                   radioButton2.setVisibility(8);
/* 168 */                   return;
                        }
/* 168 */               return;
                    }
/* 104 */           compoundButton.setChecked(this.I00iOIl.isChecked());
/* 111 */           if (compoundButton.getVisibility() != 0) {
/* 113 */               compoundButton.setVisibility(0);
                    }
/* 116 */           if (compoundButton2 == null || compoundButton2.getVisibility() == 8) {
/* 168 */               return;
                    }
/* 124 */           compoundButton2.setVisibility(8);
                }

                public void setChecked(boolean z) {
                    CompoundButton compoundButton;
/* 9 */             if ((this.I00iOIl.I001i1lo1io & 4) != 0) {
/* 13 */                if (this.I00iiO == null) {
/* 26 */                    RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
/* 28 */                    this.I00iiO = radioButton;
/* 30 */                    LinearLayout linearLayout = this.I00l0I0l0lO1;
/* 32 */                    if (linearLayout != null) {
/* 34 */                        linearLayout.addView(radioButton, -1);
                            } else {
/* 38 */                        addView(radioButton, -1);
                            }
                        }
/* 41 */                compoundButton = this.I00iiO;
                    } else {
/* 46 */                if (this.I00ilI0I1 == null) {
/* 59 */                    CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
/* 61 */                    this.I00ilI0I1 = checkBox;
/* 63 */                    LinearLayout linearLayout2 = this.I00l0I0l0lO1;
/* 65 */                    if (linearLayout2 != null) {
/* 67 */                        linearLayout2.addView(checkBox, -1);
                            } else {
/* 71 */                        addView(checkBox, -1);
                            }
                        }
/* 74 */                compoundButton = this.I00ilI0I1;
                    }
/* 76 */            compoundButton.setChecked(z);
                }

                public void setForceShowIcon(boolean z) {
/* 1 */             this.I00o101lO = z;
/* 3 */             this.I00lli11 = z;
                }

                public void setGroupDividerEnabled(boolean z) {
/* 1 */             ImageView imageView = this.I00ioIO;
/* 3 */             if (imageView != null) {
/* 15 */                imageView.setVisibility((this.I00o0iI0io1 || !z) ? 8 : 0);
                    }
                }

                public void setIcon(Drawable drawable) {
/* 3 */             O1illlIiilIl o1illlIiilIl = this.I00iOIl.I000o00OoI0I;
/* 5 */             boolean z = this.I00o101lO;
/* 7 */             if (z || this.I00lli11) {
/* 14 */                ImageView imageView = this.I00iiI;
/* 16 */                if (imageView == null && drawable == null && !this.I00lli11) {
/* 168 */                   return;
                        }
/* 26 */                if (imageView == null) {
/* 39 */                    ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
/* 41 */                    this.I00iiI = imageView2;
/* 43 */                    LinearLayout linearLayout = this.I00l0I0l0lO1;
/* 45 */                    if (linearLayout != null) {
/* 47 */                        linearLayout.addView(imageView2, 0);
                            } else {
/* 51 */                        addView(imageView2, 0);
                            }
                        }
/* 54 */                if (drawable == null && !this.I00lli11) {
/* 65 */                    this.I00iiI.setVisibility(8);
/* 68 */                    return;
                        }
/* 69 */                ImageView imageView3 = this.I00iiI;
/* 71 */                if (!z) {
/* 74 */                    drawable = null;
                        }
/* 75 */                imageView3.setImageDrawable(drawable);
/* 84 */                if (this.I00iiI.getVisibility() != 0) {
/* 88 */                    this.I00iiI.setVisibility(0);
                        }
                    }
                }

                public void setTitle(CharSequence charSequence) {
/* 1 */             TextView textView = this.I00iio;
/* 3 */             if (charSequence == null) {
/* 29 */                if (textView.getVisibility() != 8) {
/* 33 */                    this.I00iio.setVisibility(8);
                        }
                    } else {
/* 5 */                 textView.setText(charSequence);
/* 14 */                if (this.I00iio.getVisibility() != 0) {
/* 19 */                    this.I00iio.setVisibility(0);
                        }
                    }
                }
            }
