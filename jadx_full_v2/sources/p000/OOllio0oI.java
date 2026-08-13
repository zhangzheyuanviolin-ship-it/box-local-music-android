            package p000;

            import android.net.ConnectivityManager;
            import android.net.Network;
            
            public final class OOllio0oI extends ConnectivityManager.NetworkCallback {
                public final IoIlOo1o0IIl I00000oIO;

                public OOllio0oI(IoIlOo1o0IIl ioIlOo1o0IIl) {
/* 1 */             this.I00000oIO = ioIlOo1o0IIl;
                }

                @Override
                public final void onAvailable(Network network) {
/* 4 */             this.I00000oIO.I00IO1(network, true);
                }

                @Override
                public final void onLost(Network network) {
/* 4 */             this.I00000oIO.I00IO1(network, false);
                }
            }
