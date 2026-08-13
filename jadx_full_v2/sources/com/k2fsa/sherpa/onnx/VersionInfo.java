            package com.k2fsa.sherpa.onnx;

            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/k2fsa/sherpa/onnx/VersionInfo;", "", "()V", "Companion", "sherpa_onnx_release"}, m18k = 1, mv = {1, 7, 1}, xi = 48)
/* 2 */     public final class VersionInfo {

                public static final Companion INSTANCE = new Companion(null);

                static {
/* 11 */            System.loadLibrary("sherpa-onnx-jni");
                }

                @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u000b\u001a\u00020\u0004H\u0086 J\t\u0010\f\u001a\u00020\u0004H\u0086 J\t\u0010\r\u001a\u00020\u0004H\u0086 R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/k2fsa/sherpa/onnx/VersionInfo$Companion;", "", "()V", "gitDate", "", "getGitDate", "()Ljava/lang/String;", "gitSha1", "getGitSha1", "version", "getVersion", "getGitDate2", "getGitSha12", "getVersionStr2", "sherpa_onnx_release"}, m18k = 1, mv = {1, 7, 1}, xi = 48)
/* 3 */         public static final class Companion {
                    public Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 1 */                 this();
                    }

                    public final String getGitDate() {
/* 1 */                 return getGitDate2();
                    }

                    public final native String getGitDate2();

                    public final String getGitSha1() {
/* 1 */                 return getGitSha12();
                    }

                    public final native String getGitSha12();

                    public final String getVersion() {
/* 1 */                 return getVersionStr2();
                    }

                    public final native String getVersionStr2();

/* 4 */             private Companion() {
                    }
                }
            }
