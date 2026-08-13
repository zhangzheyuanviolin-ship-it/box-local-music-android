            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.net.Authenticator;
            import java.net.InetAddress;
            import java.net.MalformedURLException;
            import java.net.PasswordAuthentication;
            import java.net.URL;
            import java.util.logging.Level;
            
            final class zzbks {
                public static final PasswordAuthentication zza(String str, InetAddress inetAddress, int i, String str2, String str3, String str4) {
                    URL url;
                    try {
/* 7 */                 url = new URL("https", str, i, "");
                    } catch (MalformedURLException unused) {
/* 28 */                zzbku.zza.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl$1", "requestPasswordAuthentication", "failed to create URL for Authenticator: {0} {1}", new Object[]{"https", str});
/* 31 */                url = null;
                    }
/* 41 */            return Authenticator.requestPasswordAuthentication(str, inetAddress, i, "https", "", null, url, Authenticator.RequestorType.PROXY);
                }
            }
