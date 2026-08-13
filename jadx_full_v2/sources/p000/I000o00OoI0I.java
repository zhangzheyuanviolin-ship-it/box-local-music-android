            package p000;

            import com.google.mlkit.genai.common.DownloadStatus;
            
            public final class I000o00OoI0I implements IlOil1iooOO0 {
                public OOo0o0oO I00iOIl;
                public O1oiiIIo111o I00iiI;
                public O1lIIi I00iiO;
                public IO1io1iOI I00iio;

                @Override
                public final Object emit(Object obj, IOoil1iiIilo iOoil1iiIilo) throws Exception {
/* 1 */             DownloadStatus downloadStatus = (DownloadStatus) obj;
/* 3 */             O1oiiIIo111o o1oiiIIo111o = this.I00iiI;
/* 5 */             OOo0o0oO oOo0o0oO = this.I00iOIl;
/* 9 */             if (downloadStatus instanceof DownloadStatus.DownloadStarted) {
/* 17 */                oOo0o0oO.I00iOIl = ((DownloadStatus.DownloadStarted) downloadStatus).getBytesToDownload();
/* 33 */                o1oiiIIo111o.invoke(new Long(0L), new Long(oOo0o0oO.I00iOIl));
                    } else if (downloadStatus instanceof DownloadStatus.DownloadProgress) {
/* 59 */                o1oiiIIo111o.invoke(new Long(((DownloadStatus.DownloadProgress) downloadStatus).getTotalBytesDownloaded()), new Long(oOo0o0oO.I00iOIl));
                    } else if (downloadStatus instanceof DownloadStatus.DownloadFailed) {
/* 67 */                O1lIIi o1lIIi = this.I00iiO;
/* 75 */                String message = ((DownloadStatus.DownloadFailed) downloadStatus).getE().getMessage();
/* 79 */                if (message == null) {
/* 81 */                    message = "Unknown download error";
                        }
/* 83 */                o1lIIi.invoke(message);
                    } else {
/* 89 */                if (!(downloadStatus instanceof DownloadStatus.DownloadCompleted)) {
/* 99 */                    I000II.I00000oIO();
/* 102 */                   return null;
                        }
/* 93 */                this.I00iio.invoke();
                    }
/* 96 */            return OoiIlOl1iI.I00000oIO;
                }
            }
