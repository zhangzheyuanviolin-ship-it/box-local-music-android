            package p000;

            import android.net.Uri;
            import android.util.Log;
            import java.io.IOException;
            import java.net.HttpURLConnection;
            import java.net.URL;
            import java.util.HashMap;
            
            public final class i1IIil0oOOOl extends Thread {
                public final HashMap I00iOIl;

                public i1IIil0oOOOl(HashMap map) {
/* 1 */             this.I00iOIl = map;
                }

                @Override
                public final void run() {
/* 7 */             Uri.Builder builderBuildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
/* 11 */            HashMap map = this.I00iOIl;
/* 25 */            for (String str : map.keySet()) {
/* 39 */                builderBuildUpon.appendQueryParameter(str, (String) map.get(str));
                    }
/* 47 */            String string = builderBuildUpon.build().toString();
                    try {
                        try {
/* 64 */                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(string).openConnection();
                            try {
/* 66 */                        int responseCode = httpURLConnection.getResponseCode();
/* 72 */                        if (responseCode < 200 || responseCode >= 300) {
/* 90 */                            StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 65);
/* 95 */                            sb.append("Received non-success response code ");
/* 98 */                            sb.append(responseCode);
/* 103 */                           sb.append(" from pinging URL: ");
/* 106 */                           sb.append(string);
/* 113 */                           Log.w("HttpUrlPinger", sb.toString());
                                }
                            } finally {
/* 125 */                       httpURLConnection.disconnect();
                            }
                        } catch (IOException | RuntimeException e) {
/* 131 */                   String message = e.getMessage();
/* 156 */                   StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + String.valueOf(string).length() + 27);
/* 161 */                   sb2.append("Error while pinging URL: ");
/* 164 */                   sb2.append(string);
/* 167 */                   sb2.append(". ");
/* 170 */                   sb2.append(message);
/* 177 */                   Log.w("HttpUrlPinger", sb2.toString(), e);
                        }
                    } catch (IndexOutOfBoundsException e2) {
/* 181 */               String message2 = e2.getMessage();
/* 206 */               StringBuilder sb3 = new StringBuilder(String.valueOf(message2).length() + String.valueOf(string).length() + 32);
/* 211 */               sb3.append("Error while parsing ping URL: ");
/* 214 */               sb3.append(string);
/* 217 */               sb3.append(". ");
/* 220 */               sb3.append(message2);
/* 227 */               Log.w("HttpUrlPinger", sb3.toString(), e2);
                    }
                }
            }
