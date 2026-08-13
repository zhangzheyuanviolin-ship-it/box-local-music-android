            package p000;

            import com.google.mlkit.genai.common.DownloadStatus;
            import com.google.mlkit.genai.prompt.GenerativeModel;
            import kotlin.jvm.functions.Function1;
            
            public final class I0010o implements IlOil1iooOO0 {
                public Function1 I00iOIl;
                public GenerativeModel I00iiI;
                public O1oIOiI11o0 I00iiO;

                /* JADX WARN: Code restructure failed: missing block: B:31:0x00b2, code lost:
                
                    if (r9.I000OiO(r0, r1, r3) == r11) goto L32;
                 */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(DownloadStatus downloadStatus, IOoil1iiIilo iOoil1iiIilo) throws Throwable {
                    I0010I0i i0010I0i;
/* 1 */             O1oIOiI11o0 o1oIOiI11o0 = this.I00iiO;
/* 3 */             GenerativeModel generativeModel = this.I00iiI;
/* 5 */             Function1 function1 = this.I00iOIl;
/* 9 */             if (iOoil1iiIilo instanceof I0010I0i) {
/* 12 */                i0010I0i = (I0010I0i) iOoil1iiIilo;
/* 14 */                int i = i0010I0i.I00iiO;
/* 20 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 23 */                    i0010I0i.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 28 */                    i0010I0i = new I0010I0i(this, iOoil1iiIilo);
                        }
                    }
/* 31 */            Object obj = i0010I0i.I00iOIl;
/* 33 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 35 */            int i2 = i0010I0i.I00iiO;
/* 40 */            if (i2 == 0) {
/* 61 */                lIoii1l01l0i.I00000oOI(obj);
/* 70 */                if (downloadStatus instanceof DownloadStatus.DownloadStarted) {
/* 93 */                    function1.invoke("Downloading (" + ((DownloadStatus.DownloadStarted) downloadStatus).getBytesToDownload() + " bytes)");
                        } else if (downloadStatus instanceof DownloadStatus.DownloadProgress) {
/* 122 */                   function1.invoke("Downloading (" + ((DownloadStatus.DownloadProgress) downloadStatus).getTotalBytesDownloaded() + " bytes)");
                        } else {
/* 128 */                   if (!(downloadStatus instanceof DownloadStatus.DownloadFailed)) {
/* 160 */                       if (!(downloadStatus instanceof DownloadStatus.DownloadCompleted)) {
/* 197 */                           I000II.I00000oIO();
/* 37 */                            return null;
                                }
/* 162 */                       i0010I0i.I00iiO = 1;
/* 168 */                       if (generativeModel.warmup(i0010I0i) != ii0111o) {
                                }
/* 181 */                       return ii0111o;
                            }
/* 154 */                   function1.invoke("Download failed: " + ((DownloadStatus.DownloadFailed) downloadStatus).getE().getMessage());
                        }
/* 194 */               return OoiIlOl1iI.I00000oIO;
                    }
/* 42 */            if (i2 != 1) {
/* 44 */                if (i2 != 2) {
/* 53 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 37 */                    return null;
                        }
/* 46 */                lIoii1l01l0i.I00000oOI(obj);
/* 187 */               o1oIOiI11o0.I00IlilI0i0i = new I001i1lo1io(generativeModel);
/* 191 */               function1.invoke("Download completed");
/* 194 */               return OoiIlOl1iI.I00000oIO;
                    }
/* 57 */            lIoii1l01l0i.I00000oOI(obj);
/* 171 */           I001i1O0Ol i001i1O0Ol = I001i1O0Ol.I00000oIO;
/* 173 */           i0010I0i.I00iiO = 2;
                }
            }
