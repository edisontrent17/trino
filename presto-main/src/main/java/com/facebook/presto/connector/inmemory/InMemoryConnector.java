package com.facebook.presto.connector.inmemory;

import com.facebook.presto.spi.Connector;
import com.facebook.presto.spi.ConnectorHandleResolver;
import com.facebook.presto.spi.ConnectorIndexResolver;
import com.facebook.presto.spi.ConnectorMetadata;
import com.facebook.presto.spi.ConnectorPageSinkProvider;
import com.facebook.presto.spi.ConnectorPageSourceProvider;
import com.facebook.presto.spi.ConnectorRecordSetProvider;
import com.facebook.presto.spi.ConnectorRecordSinkProvider;
import com.facebook.presto.spi.ConnectorSplitManager;

public class InMemoryConnector implements Connector {
  @Override
  public ConnectorHandleResolver getHandleResolver() {
    return null;
  }

  @Override
  public ConnectorMetadata getMetadata() {
    return null;
  }

  @Override
  public ConnectorSplitManager getSplitManager() {
    return null;
  }

  @Override
  public ConnectorPageSourceProvider getPageSourceProvider() {
    return null;
  }

  @Override
  public ConnectorRecordSetProvider getRecordSetProvider() {
    return null;
  }

  @Override
  public ConnectorRecordSinkProvider getRecordSinkProvider() {
    return null;
  }

  @Override
  public ConnectorIndexResolver getIndexResolver() {
    return null;
  }

  @Override
  public ConnectorPageSinkProvider getPageSinkProvider() {
    return Connector.super.getPageSinkProvider();
  }
}
