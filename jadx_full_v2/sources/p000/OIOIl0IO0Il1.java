            package p000;

            import java.io.IOException;
            import java.net.Proxy;
            import java.net.ProxySelector;
            import java.net.SocketAddress;
            import java.net.URI;
            import java.util.Collections;
            import java.util.List;
            
/* 213 */   public final class OIOIl0IO0Il1 extends ProxySelector {
                public static final OIOIl0IO0Il1 I00000oIO = new OIOIl0IO0Il1();

                @Override
                public final List select(URI uri) {
/* 1 */             if (uri != null) {
/* 5 */                 return Collections.singletonList(Proxy.NO_PROXY);
                    }
/* 12 */            I000II.I000iOII("uri must not be null");
/* 15 */            return null;
                }

                @Override
/* 214 */       public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
                }
            }
