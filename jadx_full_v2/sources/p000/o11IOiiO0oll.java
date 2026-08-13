            package p000;

            import com.google.mlkit.genai.common.DownloadCallback;
            import com.google.mlkit.genai.common.DownloadStatus;
            
            public final class o11IOiiO0oll implements IlOil1iooOO0 {
                public DownloadCallback I00iOIl;

                @Override
                public final Object emit(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             DownloadCallback downloadCallback = this.I00iOIl;
/* 3 */             DownloadStatus downloadStatus = (DownloadStatus) obj;
/* 7 */             if (downloadStatus instanceof DownloadStatus.DownloadStarted) {
/* 15 */                downloadCallback.onDownloadStarted(((DownloadStatus.DownloadStarted) downloadStatus).getBytesToDownload());
                    } else if (downloadStatus instanceof DownloadStatus.DownloadProgress) {
/* 29 */                downloadCallback.onDownloadProgress(((DownloadStatus.DownloadProgress) downloadStatus).getTotalBytesDownloaded());
                    } else if (downloadStatus instanceof DownloadStatus.DownloadFailed) {
/* 43 */                downloadCallback.onDownloadFailed(((DownloadStatus.DownloadFailed) downloadStatus).getE());
                    } else {
/* 49 */                if (!(downloadStatus instanceof DownloadStatus.DownloadCompleted)) {
/* 57 */                    I000II.I00000oIO();
/* 60 */                    return null;
                        }
/* 51 */                downloadCallback.onDownloadCompleted();
                    }
/* 54 */            return OoiIlOl1iI.I00000oIO;
                }
            }
