            package p000;

            import android.app.Activity;
            import android.app.Dialog;
            import android.content.Context;
            import android.content.DialogInterface;
            import android.os.Bundle;
            import android.os.Handler;
            import android.os.Looper;
            import android.view.LayoutInflater;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.Window;
            import com.box.gallery.R;
            import java.lang.invoke.VarHandle;
            
/* 27 */    public class Iii01o00i extends Ill0l1 implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
                public Handler I0110OiO;
                public final I0lil01 I0110o;
                public final IiOool0Iiilo I0111i;
                public final Iii001 I011IO1I11OI;
                public int I011IOil;
                public int I011Ill;
                public boolean I011Io0I1ioi;
                public boolean I011Ol0;
                public int I011iIOio;
                public boolean I011iO;
                public final Iii01III0 I011iiii0i;
                public Dialog I011lIilI0lo;
                public boolean I011lO1liO1O;
                public boolean I011lOIoo0l;
                public boolean I011olOoO;
                public boolean I01I01Oolii;

                public Iii01o00i() {
/* 7 */             I0lil01 i0lil01 = new I0lil01(4);
/* 10 */            i0lil01.I00iiI = this;
/* 12 */            VarHandle.storeStoreFence();
/* 15 */            this.I0110o = i0lil01;
/* 19 */            IiOool0Iiilo iiOool0Iiilo = new IiOool0Iiilo();
/* 22 */            iiOool0Iiilo.I00iOIl = this;
/* 24 */            VarHandle.storeStoreFence();
/* 27 */            this.I0111i = iiOool0Iiilo;
/* 31 */            Iii001 iii001 = new Iii001();
/* 34 */            iii001.I00iOIl = this;
/* 36 */            VarHandle.storeStoreFence();
/* 39 */            this.I011IO1I11OI = iii001;
/* 42 */            this.I011IOil = 0;
/* 44 */            this.I011Ill = 0;
/* 47 */            this.I011Io0I1ioi = true;
/* 49 */            this.I011Ol0 = true;
/* 52 */            this.I011iIOio = -1;
/* 56 */            Iii01III0 iii01III0 = new Iii01III0();
/* 59 */            iii01III0.I00iOIl = this;
/* 61 */            VarHandle.storeStoreFence();
/* 64 */            this.I011iiii0i = iii01III0;
/* 66 */            this.I01I01Oolii = false;
                }

                @Override
                public final ilioOIIoIi10 I00000oIO() {
/* 1 */             ilioOIIoIi10 iliooiioii10I00000oIO = super.I00000oIO();
/* 7 */             Iii01iIil iii01iIil = new Iii01iIil();
/* 10 */            iii01iIil.I00iiI = this;
/* 14 */            iii01iIil.I00iOIl = (Ill0iliOoOl1) iliooiioii10I00000oIO;
/* 16 */            VarHandle.storeStoreFence();
/* 20 */            return iii01iIil;
                }

                @Override
                public final void I00111O() {
/* 2 */             this.I00ooiO1I = true;
                }

                @Override
                public final void I001IO000(Context context) {
/* 1 */             super.I001IO000(context);
/* 8 */             this.I010l1ol111.I0001Ioi1lo(this.I011iiii0i);
/* 13 */            if (this.I011olOoO) {
/* 29 */                return;
                    }
/* 16 */            this.I011lOIoo0l = false;
                }

                @Override
                public void I001i1O0Ol(Bundle bundle) {
/* 1 */             super.I001i1O0Ol(bundle);
/* 9 */             this.I0110OiO = new Handler();
/* 20 */            this.I011Ol0 = this.I00ol1 == 0;
/* 22 */            if (bundle != null) {
/* 30 */                this.I011IOil = bundle.getInt("android:style", 0);
/* 38 */                this.I011Ill = bundle.getInt("android:theme", 0);
/* 46 */                this.I011Io0I1ioi = bundle.getBoolean("android:cancelable", true);
/* 56 */                this.I011Ol0 = bundle.getBoolean("android:showsDialog", this.I011Ol0);
/* 65 */                this.I011iIOio = bundle.getInt("android:backStackId", -1);
                    }
                }

                @Override
                public final void I001l0I00() {
/* 2 */             this.I00ooiO1I = true;
/* 4 */             Dialog dialog = this.I011lIilI0lo;
/* 6 */             if (dialog != null) {
/* 8 */                 this.I011lO1liO1O = true;
/* 11 */                dialog.setOnDismissListener(null);
/* 16 */                this.I011lIilI0lo.dismiss();
/* 21 */                if (!this.I011lOIoo0l) {
/* 25 */                    onDismiss(this.I011lIilI0lo);
                        }
/* 28 */                this.I011lIilI0lo = null;
/* 31 */                this.I01I01Oolii = false;
                    }
                }

                @Override
                public final void I001lIiIIo1O() {
/* 2 */             this.I00ooiO1I = true;
/* 6 */             if (!this.I011olOoO && !this.I011lOIoo0l) {
/* 12 */                this.I011lOIoo0l = true;
                    }
/* 18 */            this.I010l1ol111.I000OiO(this.I011iiii0i);
                }

                /* JADX WARN: Removed duplicated region for block: B:26:0x0042 A[Catch: all -> 0x004a, TryCatch #0 {all -> 0x004a, blocks: (B:12:0x0018, B:14:0x0024, B:24:0x003c, B:26:0x0042, B:29:0x004c, B:20:0x002e, B:22:0x0034, B:23:0x0039, B:30:0x0064), top: B:45:0x0018 }] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final LayoutInflater I001lllioOl(Bundle bundle) {
                    Context contextI000OiO;
/* 1 */             LayoutInflater layoutInflaterI001lllioOl = super.I001lllioOl(bundle);
/* 5 */             boolean z = this.I011Ol0;
/* 8 */             if (z && !this.I011iO) {
/* 16 */                if (z && !this.I01I01Oolii) {
                            try {
/* 25 */                        this.I011iO = true;
/* 27 */                        Dialog dialogI00IoO0 = I00IoO0();
/* 31 */                        this.I011lIilI0lo = dialogI00IoO0;
/* 35 */                        if (this.I011Ol0) {
/* 37 */                            int i = this.I011IOil;
/* 39 */                            if (i == 1 || i == 2) {
/* 58 */                                dialogI00IoO0.requestWindowFeature(1);
/* 61 */                                contextI000OiO = I000OiO();
/* 65 */                                if (contextI000OiO != null) {
/* 71 */                                    this.I011lIilI0lo.setOwnerActivity((Activity) contextI000OiO);
                                        }
/* 81 */                                this.I011lIilI0lo.setCancelable(this.I011Io0I1ioi);
/* 88 */                                this.I011lIilI0lo.setOnCancelListener(this.I0111i);
/* 95 */                                this.I011lIilI0lo.setOnDismissListener(this.I011IO1I11OI);
/* 98 */                                this.I01I01Oolii = true;
                                    } else if (i == 3) {
/* 47 */                                Window window = dialogI00IoO0.getWindow();
/* 51 */                                if (window != null) {
/* 55 */                                    window.addFlags(24);
                                        }
/* 58 */                                dialogI00IoO0.requestWindowFeature(1);
/* 61 */                                contextI000OiO = I000OiO();
/* 65 */                                if (contextI000OiO != null) {
                                        }
/* 81 */                                this.I011lIilI0lo.setCancelable(this.I011Io0I1ioi);
/* 88 */                                this.I011lIilI0lo.setOnCancelListener(this.I0111i);
/* 95 */                                this.I011lIilI0lo.setOnDismissListener(this.I011IO1I11OI);
/* 98 */                                this.I01I01Oolii = true;
                                    } else {
/* 61 */                                contextI000OiO = I000OiO();
/* 65 */                                if (contextI000OiO != null) {
                                        }
/* 81 */                                this.I011lIilI0lo.setCancelable(this.I011Io0I1ioi);
/* 88 */                                this.I011lIilI0lo.setOnCancelListener(this.I0111i);
/* 95 */                                this.I011lIilI0lo.setOnDismissListener(this.I011IO1I11OI);
/* 98 */                                this.I01I01Oolii = true;
                                    }
                                } else {
/* 102 */                           this.I011lIilI0lo = null;
                                }
/* 104 */                       this.I011iO = false;
                            } catch (Throwable th) {
/* 107 */                       this.I011iO = false;
/* 109 */                       throw th;
                            }
                        }
/* 114 */               if (Ill1OlOOl.I00IOO(2)) {
/* 116 */                   toString();
                        }
/* 119 */               Dialog dialog = this.I011lIilI0lo;
/* 121 */               if (dialog != null) {
/* 127 */                   return layoutInflaterI001lllioOl.cloneInContext(dialog.getContext());
                        }
                    } else if (Ill1OlOOl.I00IOO(2)) {
/* 138 */               toString();
                    }
/* 168 */           return layoutInflaterI001lllioOl;
                }

                @Override
                public final void I001lloI(Bundle bundle) {
/* 1 */             Dialog dialog = this.I011lIilI0lo;
/* 3 */             if (dialog != null) {
/* 5 */                 Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
/* 12 */                bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
/* 17 */                bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
                    }
/* 20 */            int i = this.I011IOil;
/* 22 */            if (i != 0) {
/* 26 */                bundle.putInt("android:style", i);
                    }
/* 29 */            int i2 = this.I011Ill;
/* 31 */            if (i2 != 0) {
/* 35 */                bundle.putInt("android:theme", i2);
                    }
/* 38 */            boolean z = this.I011Io0I1ioi;
/* 40 */            if (!z) {
/* 44 */                bundle.putBoolean("android:cancelable", z);
                    }
/* 47 */            boolean z2 = this.I011Ol0;
/* 49 */            if (!z2) {
/* 53 */                bundle.putBoolean("android:showsDialog", z2);
                    }
/* 56 */            int i3 = this.I011iIOio;
/* 59 */            if (i3 != -1) {
/* 63 */                bundle.putInt("android:backStackId", i3);
                    }
                }

                @Override
                public final void I00II0Ol1O0l() {
/* 2 */             this.I00ooiO1I = true;
/* 4 */             Dialog dialog = this.I011lIilI0lo;
/* 6 */             if (dialog != null) {
/* 9 */                 this.I011lO1liO1O = false;
/* 11 */                dialog.show();
/* 20 */                View decorView = this.I011lIilI0lo.getWindow().getDecorView();
/* 27 */                decorView.setTag(R.id.view_tree_lifecycle_owner, this);
/* 33 */                decorView.setTag(R.id.view_tree_view_model_store_owner, this);
/* 39 */                decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
                    }
                }

                @Override
                public final void I00II0oii1o() {
/* 2 */             this.I00ooiO1I = true;
/* 4 */             Dialog dialog = this.I011lIilI0lo;
/* 6 */             if (dialog != null) {
/* 8 */                 dialog.hide();
                    }
                }

                @Override
                public final void I00IO1oi11O(Bundle bundle) {
                    Bundle bundle2;
/* 2 */             this.I00ooiO1I = true;
/* 6 */             if (this.I011lIilI0lo == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
/* 29 */                return;
                    }
/* 20 */            this.I011lIilI0lo.onRestoreInstanceState(bundle2);
                }

                @Override
                public final void I00IOO(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
                    Bundle bundle2;
/* 1 */             super.I00IOO(layoutInflater, viewGroup, bundle);
/* 6 */             if (this.I0100i != null || this.I011lIilI0lo == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
/* 98 */                return;
                    }
/* 24 */            this.I011lIilI0lo.onRestoreInstanceState(bundle2);
                }

                public final void I00IoIO0lI(boolean z) {
/* 3 */             if (this.I011lOIoo0l) {
/* 5 */                 return;
                    }
/* 7 */             this.I011lOIoo0l = true;
/* 10 */            this.I011olOoO = false;
/* 12 */            Dialog dialog = this.I011lIilI0lo;
/* 14 */            if (dialog != null) {
/* 17 */                dialog.setOnDismissListener(null);
/* 22 */                this.I011lIilI0lo.dismiss();
/* 25 */                if (!z) {
/* 37 */                    if (Looper.myLooper() == this.I0110OiO.getLooper()) {
/* 41 */                        onDismiss(this.I011lIilI0lo);
                            } else {
/* 49 */                        this.I0110OiO.post(this.I0110o);
                            }
                        }
                    }
/* 52 */            this.I011lO1liO1O = true;
/* 56 */            if (this.I011iIOio < 0) {
/* 101 */               I1loiIo i1loiIo = new I1loiIo(I000lI());
/* 104 */               i1loiIo.I000oI1ioi = true;
/* 106 */               i1loiIo.I000II(this);
/* 109 */               i1loiIo.I0000O(true);
/* 168 */               return;
                    }
/* 58 */            Ill1OlOOl ill1OlOOlI000lI = I000lI();
/* 62 */            int i = this.I011iIOio;
/* 64 */            if (i < 0) {
/* 91 */                I000II.I000iOII(Oi010OO0.I000oI1ioi(i, "Bad id: "));
/* 94 */                return;
                    }
/* 68 */            Ill1OOli ill1OOli = new Ill1OOli();
/* 71 */            ill1OOli.I00000oOI = ill1OlOOlI000lI;
/* 73 */            ill1OOli.I00000oIO = i;
/* 75 */            VarHandle.storeStoreFence();
/* 78 */            ill1OlOOlI000lI.I001i1O0Ol(ill1OOli, true);
/* 82 */            this.I011iIOio = -1;
                }

                public Dialog I00IoO0() {
/* 6 */             if (Ill1OlOOl.I00IOO(3)) {
/* 8 */                 toString();
                    }
/* 19 */            return new IOiOOll1(I00IioO0OiOi(), this.I011Ill);
                }

                @Override
                public final void onDismiss(DialogInterface dialogInterface) {
/* 3 */             if (this.I011lO1liO1O) {
/* 29 */                return;
                    }
/* 10 */            if (Ill1OlOOl.I00IOO(3)) {
/* 12 */                toString();
                    }
/* 16 */            I00IoIO0lI(true);
                }

                @Override
/* 28 */        public void onCancel(DialogInterface dialogInterface) {
                }
            }
