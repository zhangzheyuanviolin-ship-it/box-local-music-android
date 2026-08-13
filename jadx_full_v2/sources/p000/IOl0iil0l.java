            package p000;

            import android.os.CancellationSignal;
            
            public final class IOl0iil0l implements CancellationSignal.OnCancelListener {
                public final int I00000oIO;
                public Object I00000oOI;

                public IOl0iil0l(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final void onCancel() {
/* 1 */             int i = this.I00000oIO;
/* 3 */             Object obj = this.I00000oOI;
                    switch (i) {
                        case 0:
/* 46 */                    ((OlIl0i) obj).I000II(null);
                            break;
                        default:
/* 8 */                     Oo0IOoOi01 oo0IOoOi01 = (Oo0IOoOi01) obj;
/* 10 */                    if (oo0IOoOi01 != null) {
/* 12 */                        O0oIlOolIO o0oIlOolIO = oo0IOoOi01.I0000O;
/* 14 */                        if (o0oIlOolIO != null) {
/* 24 */                            o0oIlOolIO.I001lllioOl.setValue(Oo0lI00l.I00000oIO(Oo0lI00l.I00000oOI));
                                }
/* 27 */                        O0oIlOolIO o0oIlOolIO2 = oo0IOoOi01.I0000O;
/* 29 */                        if (o0oIlOolIO2 != null) {
/* 39 */                            o0oIlOolIO2.I001lIiIIo1O.setValue(Oo0lI00l.I00000oIO(Oo0lI00l.I00000oOI));
                                    break;
                                }
                            }
                            break;
                    }
                }
            }
