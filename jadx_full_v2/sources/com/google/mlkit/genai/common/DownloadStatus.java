            package com.google.mlkit.genai.common;

            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.O0000Ioio00;
            
            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/google/mlkit/genai/common/DownloadStatus;", "", "<init>", "()V", "DownloadStarted", "DownloadFailed", "DownloadProgress", "DownloadCompleted", "Lcom/google/mlkit/genai/common/DownloadStatus$DownloadCompleted;", "Lcom/google/mlkit/genai/common/DownloadStatus$DownloadFailed;", "Lcom/google/mlkit/genai/common/DownloadStatus$DownloadProgress;", "Lcom/google/mlkit/genai/common/DownloadStatus$DownloadStarted;", "java.com.google.android.libraries.mlkit.granules.genai.common_mlkit_genai_common"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
/* 3 */     public abstract class DownloadStatus {

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0004"}, d2 = {"Lcom/google/mlkit/genai/common/DownloadStatus$DownloadCompleted;", "Lcom/google/mlkit/genai/common/DownloadStatus;", "<init>", "()V", "java.com.google.android.libraries.mlkit.granules.genai.common_mlkit_genai_common"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
                public static final class DownloadCompleted extends DownloadStatus {
                    public static final DownloadCompleted INSTANCE = new DownloadCompleted();

                    private DownloadCompleted() {
/* 2 */                 super(null);
                    }
                }

                @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/google/mlkit/genai/common/DownloadStatus$DownloadFailed;", "Lcom/google/mlkit/genai/common/DownloadStatus;", "e", "Lcom/google/mlkit/genai/common/GenAiException;", "<init>", "(Lcom/google/mlkit/genai/common/GenAiException;)V", "getE", "()Lcom/google/mlkit/genai/common/GenAiException;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "java.com.google.android.libraries.mlkit.granules.genai.common_mlkit_genai_common"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
                public static final class DownloadFailed extends DownloadStatus {

                    private final GenAiException e;

                    public DownloadFailed(GenAiException genAiException) {
/* 2 */                 super(null);
/* 5 */                 this.e = genAiException;
                    }

                    public final GenAiException getE() {
/* 1 */                 return this.e;
                    }

                    public final DownloadFailed copy(GenAiException e) {
/* 3 */                 return new DownloadFailed(e);
                    }

                    public boolean equals(Object other) {
/* 2 */                 if (this == other) {
/* 1 */                     return true;
                        }
                        return (other instanceof DownloadFailed) && O0000Ioio00.I0000O(this.e, ((DownloadFailed) other).e);
                    }

                    public final GenAiException getE() {
/* 1 */                 return this.e;
                    }

                    public int hashCode() {
/* 3 */                 return this.e.hashCode();
                    }

                    public String toString() {
/* 1 */                 GenAiException genAiException = this.e;
/* 15 */                StringBuilder sb = new StringBuilder(String.valueOf(genAiException).length() + 18);
/* 20 */                sb.append("DownloadFailed(e=");
/* 23 */                sb.append(genAiException);
/* 28 */                sb.append(")");
/* 31 */                return sb.toString();
                    }
                }

                @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/google/mlkit/genai/common/DownloadStatus$DownloadProgress;", "Lcom/google/mlkit/genai/common/DownloadStatus;", "totalBytesDownloaded", "", "<init>", "(J)V", "getTotalBytesDownloaded", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "java.com.google.android.libraries.mlkit.granules.genai.common_mlkit_genai_common"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
                public static final class DownloadProgress extends DownloadStatus {

                    private final long totalBytesDownloaded;

                    public DownloadProgress(long j) {
/* 2 */                 super(null);
/* 5 */                 this.totalBytesDownloaded = j;
                    }

                    public final long getTotalBytesDownloaded() {
/* 1 */                 return this.totalBytesDownloaded;
                    }

                    public final DownloadProgress copy(long totalBytesDownloaded) {
/* 3 */                 return new DownloadProgress(totalBytesDownloaded);
                    }

                    public boolean equals(Object other) {
/* 2 */                 if (this == other) {
/* 1 */                     return true;
                        }
                        return (other instanceof DownloadProgress) && this.totalBytesDownloaded == ((DownloadProgress) other).totalBytesDownloaded;
                    }

                    public final long getTotalBytesDownloaded() {
/* 1 */                 return this.totalBytesDownloaded;
                    }

                    public int hashCode() {
/* 3 */                 return Long.hashCode(this.totalBytesDownloaded);
                    }

                    public String toString() {
/* 1 */                 long j = this.totalBytesDownloaded;
/* 15 */                StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 39);
/* 20 */                sb.append("DownloadProgress(totalBytesDownloaded=");
/* 23 */                sb.append(j);
/* 28 */                sb.append(")");
/* 31 */                return sb.toString();
                    }
                }

                @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/google/mlkit/genai/common/DownloadStatus$DownloadStarted;", "Lcom/google/mlkit/genai/common/DownloadStatus;", "bytesToDownload", "", "<init>", "(J)V", "getBytesToDownload", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "java.com.google.android.libraries.mlkit.granules.genai.common_mlkit_genai_common"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
                public static final class DownloadStarted extends DownloadStatus {

                    private final long bytesToDownload;

                    public DownloadStarted(long j) {
/* 2 */                 super(null);
/* 5 */                 this.bytesToDownload = j;
                    }

                    public final long getBytesToDownload() {
/* 1 */                 return this.bytesToDownload;
                    }

                    public final DownloadStarted copy(long bytesToDownload) {
/* 3 */                 return new DownloadStarted(bytesToDownload);
                    }

                    public boolean equals(Object other) {
/* 2 */                 if (this == other) {
/* 1 */                     return true;
                        }
                        return (other instanceof DownloadStarted) && this.bytesToDownload == ((DownloadStarted) other).bytesToDownload;
                    }

                    public final long getBytesToDownload() {
/* 1 */                 return this.bytesToDownload;
                    }

                    public int hashCode() {
/* 3 */                 return Long.hashCode(this.bytesToDownload);
                    }

                    public String toString() {
/* 1 */                 long j = this.bytesToDownload;
/* 15 */                StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 33);
/* 20 */                sb.append("DownloadStarted(bytesToDownload=");
/* 23 */                sb.append(j);
/* 28 */                sb.append(")");
/* 31 */                return sb.toString();
                    }
                }

                public DownloadStatus(DefaultConstructorMarker defaultConstructorMarker) {
                }

/* 4 */         private DownloadStatus() {
/* 5 */             throw null;
                }
            }
