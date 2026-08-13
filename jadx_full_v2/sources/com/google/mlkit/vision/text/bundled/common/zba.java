            package com.google.mlkit.vision.text.bundled.common;

            import android.content.Context;
            import android.os.RemoteException;
            import com.google.mlkit.vision.text.pipeline.VkpTextRecognizerOptions;
            import com.google.mlkit.vision.text.pipeline.zbi;
            import com.google.mlkit.vision.text.pipeline.zbn;
            import com.google.mlkit.vision.text.pipeline.zbo;
            import p000.IoOlilli0ol;
            import p000.O1o01iO0liI0;
            import p000.i0ol1oOIi1;
            import p000.i10i11Ili;
            import p000.i10i1II1iIl0;
            import p000.i10iollO00;
            
            final class zba extends i10i1II1iIl0 {
                private final Context zba;
                private final String zbb;
                private final boolean zbc;
                private final String zbd;
                private final String zbe;
                private zbi zbf;

                public zba(Context context, String str, String str2, String str3, boolean z) {
/* 3 */             super("com.google.mlkit.vision.text.aidls.ITextRecognizer");
/* 6 */             this.zba = context;
/* 8 */             this.zbb = str;
/* 10 */            this.zbd = str2;
/* 12 */            this.zbe = str3;
/* 14 */            this.zbc = z;
                }

                @Override
                public final i10iollO00 zbb(IoOlilli0ol ioOlilli0ol, i10i11Ili i10i11ili) throws O1o01iO0liI0, SecurityException, RemoteException {
/* 1 */             zbi zbiVar = this.zbf;
/* 3 */             if (zbiVar == null) {
/* 89 */                throw new RemoteException("Process is started without initiation.");
                    }
/* 6 */             zbn zbnVarZbb = zbiVar.zbb(ioOlilli0ol, i10i11ili, true);
/* 10 */            zbo zboVarZbc = zbnVarZbb.zbc();
/* 18 */            if (zboVarZbc.zbd()) {
/* 20 */                return zbnVarZbb.zbb();
                    }
/* 35 */            throw ((RemoteException) zboVarZbc.zbb().I00000oIO());
                }

                @Override
                public final void zbc() throws RemoteException {
/* 3 */             if (this.zbf == null) {
/* 7 */                 System.loadLibrary("mlkit_google_ocr_pipeline");
/* 10 */                String str = this.zbe;
/* 24 */                String str2 = (str == null || str.isEmpty()) ? "" : this.zbe;
/* 26 */                String str3 = this.zbb;
/* 28 */                String str4 = this.zbd;
/* 30 */                boolean z = this.zbc;
/* 32 */                VkpTextRecognizerOptions.Builder builder = VkpTextRecognizerOptions.builder(str3, str4, str2);
/* 36 */                builder.setEnableLowLatencyInBackground(z);
/* 45 */                zbi zbiVarZba = zbi.zba(this.zba, builder.build());
/* 49 */                this.zbf = zbiVarZba;
/* 51 */                zbo zboVarZbc = zbiVarZba.zbc();
/* 59 */                if (!zboVarZbc.zbd()) {
/* 72 */                    throw ((RemoteException) zboVarZbc.zbb().I00000oIO());
                        }
                    }
                }

                @Override
                public final void zbd() {
/* 1 */             zbi zbiVar = this.zbf;
/* 3 */             if (zbiVar != null) {
/* 5 */                 zbiVar.zbd();
/* 9 */                 this.zbf = null;
                    }
                }

                @Override
                public final i0ol1oOIi1[] zbe(IoOlilli0ol ioOlilli0ol, i10i11Ili i10i11ili) throws RemoteException {
/* 89 */            throw new RemoteException("#recognizeBitmap should not be triggered from text thick client.");
                }
            }
